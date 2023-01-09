import javax.swing.JOptionPane;

/* 멀티스레드를 사용한 카운터와 동시에 입력박스를 띄우는 스레드 프로그램
 */
class ThEx08 extends Thread{

	@Override
	public void run() {
		for(int i = 10; i>=1;i--) {
			System.out.println(i);
			
			try {
				sleep(1000);//1초간 잠시 스레드를 일시정지=>1초간격으로 카운트
			}catch(Exception e) {}
		}
	}//스레드 문장 구현
}

public class ThreadEx08 {
	public static void main(String[] args) {
		ThEx08 th01 = new ThEx08();
		th01.start();//스레드 시작
		
		String name = JOptionPane.showInputDialog("이름입력>>");
		System.out.println("입력하신 이름은 "+name+"입니다.");
	}
}
 