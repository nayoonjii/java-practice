/* Runnable 인터페이스를 구현상속받아서 만든 멀티 스레드 구현특징
 * 1. 다중상속을 받을수 있다.
 * 2. 이 인터페이스를 구현상속받은 자손으로 멀티스레드를 시작하는 start()메서드가 없다. 그래서
 *		자손클래스 객체를 Thread생성자 인자값으로 전달해서 다시 한번더 객체를 생성해야한다. 
 *		이때 생성된 객체로 start()메서드를 호출해서 스레드를 시작하면 된다.
 *		이유는 start()메서드가 Thread클래스에서 생성된 메서드 이기 때문이다.
 */
class Thread04 implements Runnable{

	@Override
	public void run() {
		for(int num = 1; num<=5; num++) {
			for(int k = 1; k<10000000; k++);//스레드를 구현할 시간적 여유를 둠
			System.out.println(Thread.currentThread().getName()+" : "+num);
			//현재 실행중인 스레드 이름을 반환
		}
	}//스레드 문장이 구현
}
public class ThreadEx04 {
	public static void main(String[] args) {
		Thread04 th01 = new Thread04();
		Thread04 th02 = new Thread04();
		Thread t01 = new Thread(th01,"첫번째 스레드");
		Thread t02 = new Thread(th02,"두번째 스레드");
		t01.start(); t02.start();
	}
}
