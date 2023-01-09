/* 함수형 인터페이스인 Runnable을 사용하여 람다식으로 스레드를 생성, 
 * 그 자손인 Thread클래스를 람다식으로 사용해서 스레드를 생성
 */
public class RunnableExample05 {
	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			for(int i = 10; i>=1;i=i-1) {
				System.out.println(i);
			}
		};
		Thread th = new Thread(runnable);
		th.start();
		
		Thread th2 = new Thread(()->{
			for(int i = 1; i<=10;i++) {
				System.out.println(i);
			}
		});
		th2.start();//쓰레드 시작
	}
}
