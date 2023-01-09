/* synchronized 키워드로 메서드에 동기화가 처리된 출금작업
 * ->잔액이 음의 정수가 나오지 않는다. 이유는 한번에 하나의 쓰레드에 의해서만 출금작업이 이루어지도록
 * 임계영역을 설정 했기 때문이다.  
 */
class Account3{
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	//동기화가 된 출금작업(withdraw-빼내다(출금))
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			balance -= money;
		}
	}//withdraw()
}

//스레드 클래스
class RunEx13 implements Runnable{
	Account3 acc = new Account3();
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random()*3+1)*100;//100, 200, 300중의 한 정수값을 
													//임의로 선택해서 출금
			acc.withdraw(money);//출금작업
			System.out.println("계좌 잔액 = "+acc.getBalance());
		}//while
	}//run()
}
public class ThreadEx13 {
	public static void main(String[] args) {
		RunEx13 r = new RunEx13();
		Thread th01 = new Thread(r);
		Thread th02 = new Thread(r);
		th01.start(); th02.start();
	}
}