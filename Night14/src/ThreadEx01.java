/* 멀티 스레드 구현법)
 * 1. Thread클래스를 상속해서 run()메서드를 오버라이딩을 한다음 구현한다.
 * 2. Thread클래스를 상속받으면 단일 상속만 가능하다는 특징이있다.
 * 3. Thread클래스를 상속받은 자손클래스 객체로 start()메서드를 호출하면 스레드가 시작되고 실행 대기 상태에 있다가
 *		자기차례가 되면 run()메서드를 자동 호출해서 스레드가 구현된다.
 */
class Thread01 extends Thread{
	Thread01(String name){
		super(name);//부모클래스 생성자를 호출하면서 스레드 이름을 구함
	}

	@Override
	public void run() {
		for(int num = 1; num<=5; num++) {
			for(int k = 1; k<10000000; k++);//스레드를 구현할 시간적 여유를둠
			System.out.println(getName()+":"+num);//스레드 이름을 반환
		}
	}//스레드 문장구현
}
public class ThreadEx01 {
	public static void main(String[] args) {

		Thread01 th01 = new Thread01("첫번쨰 스레드");
		Thread01 th02 = new Thread01("두번쨰 쓰레드");
		th01.start(); th02.start();//스레드 시작
		
	}

}
