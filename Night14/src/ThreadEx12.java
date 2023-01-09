/* 동기화가 처리 안되어서 출금후 -잔고 금액이 나오는 실습예제 
 */
class Account12{//계좌 클래스
	private int balance = 1000;//계좌 잔액
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int money) {
		if(balance >= money) {//잔액이 출금액보다 크면
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {}
			balance -= money;
		}
	}//출금작업이 이루어짐
}
class RunEx12 implements Runnable{
	Account12 acc = new Account12();
	
	@Override
	public void run() {
		while(acc.getBalance()>0) {//잔액이 0보다크면
			int money = (int)(Math.random()*3+1)*200;
			//random() 메서드에 의해서 0.0이상 1.0미만 사이의 실수 숫자 난수가 발생->*3하면 0.0이상3.0미만
			//->+1하면 1.0이상4.0미만->(int)로 형변환하면 소수점이하는 버린다.1이상4미만->*200하면
			//200이상 800미만
			acc.withdraw(money);//출금작업이 이루어짐
			System.out.println("계좌 잔액: "+acc.getBalance());
		}//while
	}//run()
	
}
public class ThreadEx12 {
	public static void main(String[] args) {
		RunEx12 r = new RunEx12();
		new Thread(r).start();
		new Thread(r).start();//스레드 시작
	}
}
