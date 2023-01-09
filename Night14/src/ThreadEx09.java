import javax.swing.JOptionPane;

/* 스레드에 의해서 동시에 카운터가 이루어지는 해당 프로그램이 스케줄링 메서드에 의해서 
 * 카운더가 중단되는 예제
 */
class ThEx09 extends Thread{

	@Override
	public void run() {
		int i = 10;
		
		while(i != 0 && !isInterrupted()) {//isInterrupted()메서드는 인터럽트된 상태
			//를 true or false즉 boolean타입으로 반환
			System.out.println(i--);//후행감소
			
			for(long x = 0; x<2500000000L;x++);//시간적 여유를 둠			
		}
		System.out.println("카운터가 종료");
	}//run() 
	
}
public class ThreadEx09 {
	public static void main(String[] args) {
		ThEx09 th = new ThEx09();
		th.start();//스레드 시작
		
		String language = JOptionPane.showInputDialog("배우는 프로그램 언어 입력>>");
		System.out.println("입력한 프로그램 언어"+language);
		th.interrupt();//인터럽트를 호출하며 인터럽트된 상태가 true가 된다.
	}
}
