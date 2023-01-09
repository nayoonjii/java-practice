/* 스레드의 스케줄링 메서드에서 교착상태가 발생해서 사용하지 않기를 권장하는
 * suspend(), resume(), stop()메서드에 관한 실습
 */
class ThEx11 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			//현재실행중인 스레드 이름을 반환
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException i) {}
		}
	}//run()->스레드 문장구현
	
}
public class ThreadEx11 {
	public static void main(String[] args) {
		ThEx11 r = new ThEx11();
		Thread t01 = new Thread(r,"*");
		Thread t02 = new Thread(r,"**");
		Thread t03 = new Thread(r,"***");
		
		t01.start(); t02.start(); t03.start();//스레드 시작
		
		try {
			Thread.sleep(2000);//2초간 잠시 쉰다.
			t01.suspend();//t01스레드 일시정지
			Thread.sleep(2000);
			t02.suspend();
			Thread.sleep(3000);
			t01.resume();//t01스레드를 다시 동작하게 
			Thread.sleep(3000);
			t01.stop(); t02.stop();//t01, t02 스레드 중단
			Thread.sleep(2000);
			t03.stop();
		}catch(Exception e) {}
	}
}
