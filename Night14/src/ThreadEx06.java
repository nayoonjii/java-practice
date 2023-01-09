/* 동기화 기법 즉 임계영역 의미)
 * 출금작업과 같은 경우에는 여러 사람이 동시에 출금작업을 하지 못하도록 synchronized 키워드를 사용해서 
 * 동기화 즉 임계영역을 지정하면 한번에 하나의 스레드에 의해서만 출금작업이 이루어진다. 이것이 곧 동기화 즉 임계영역이다.
 * 멀티스레드에서 하나의 스레드에 의해서만 스레드 작업이 이루어지도록 영역을 지정하는것을 동기화 임계영역이라고 한다.
 */
class Atm{//Atm계좌
	private int money;//은행계좌 잔액
	
	public Atm(int m) {
		money = m;//계좌 개설시 입금금액
	}
	
	synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name+": 입금금액: "+amount);
	}//입금작업시 동기화 처리
	
	synchronized void withdraw(int amount, String name) {
		if((money-amount)>0) {//잔액-출금잔액>0 보다 크면
			money -= amount;
			System.out.println(name+": 출금금액: "+amount);
		}else {
			System.out.println(name+": 출금 못함(잔액 부족)");
		}
	}//출금작업시 동기화 처리
	
	public void getmoney() {
		System.out.println("   계좌 잔액은: "+money);
	}
}

//스레드 클래스
class AtmUser extends Thread{//Atm사용자
	boolean flag = false;//입금과 출금 분리
	Atm obj;
	
	public AtmUser(Atm obj, String name) {
		super(name);//오버로딩된 생성자를 호출
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			try {sleep(500);}catch(InterruptedException e) {}
			
			if(flag) {//==true가 생략
				obj.deposit((int)(Math.random()*10+2)*100, getName());
				//random()메서드로0.0이상1.0미만 사이의 실수 숫자 난수를 발생, *10하면 0.0이상 10.0미만
				//->+2 하면 2.0이상 12.0미만->(int)형변환 하면 소수점이하는 버리고
				//2이상 12미만 즉 2이상 11-> *100 하면 200, 300, 400, ..., 1100사이 정수숫자 난수 발생
				obj.getmoney();
				}else {
					obj.withdraw((int)(Math.random()*10+2)*100,getName());//츨금
					obj.getmoney();
				}//if else
				flag =!flag;//false->true, true->false
		}//for
	}//run()
}
public class ThreadEx06 {
	public static void main(String[] args) {
		Atm obj = new Atm(1000);//1000원입금하고 게좌 개설
		AtmUser user01 = new AtmUser(obj, "홍길동");
		AtmUser user02 = new AtmUser(obj, "이순신");
		AtmUser user03 = new AtmUser(obj, "강감찬");
		
		user01.start(); user02.start(); user03.start();//스레드 시작 한번만 호출할수있다.
		
	}
}
