import javax.swing.JOptionPane;

/* 스레드의 스커줄링 메서드에 의해서 해당 프로그램 카운터가 종료되거나 그렇지 못하는 
 * 실습 예제 
 */
class ThEx10 extends Thread{

	@Override
	public void run() {
		int count = 10;
		
		while(count != 0 && !isInterrupted()) {
			System.out.println(count--);
			
			try {
				Thread.sleep(1000);//1초간 스레드 일시정지
			}catch(InterruptedException ie) {
				//스레드 내부적으로 인터럽트 예외가 발생하면 해당 스레드의 인터럽트 된 상태가 false로 
				//자동 초기화가된다.
				/* 문제) 그러면 해당 스레드 카운터를 중단 하려는 코드를 추가해보자 
				 */
				interrupt();//해당스레드의 인터럽트 된 상태가 false에서 true로 초기화
			}
		}//while
		System.out.println("카운트 종료");
	}//run()
	
}
public class ThreadEx10 {
	public static void main(String[] args) {
		ThEx10 th = new ThEx10();
		th.start();//스레드 시작
		
		String inputName = JOptionPane.showInputDialog("좋아하는 과일이름입력>>");
		System.out.println("좋아하는 과일이름은 "+inputName);
		th.interrupt();//인터럽트 된 상태가 true
	}
}
