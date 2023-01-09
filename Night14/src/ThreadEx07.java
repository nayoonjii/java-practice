import javax.swing.JOptionPane;

/* 하나의 프로그램이 종료 되어야 다음 프로그램이 실행됨. -> 멀티스레드가 아닌 단일 프로그램
 * 멀티 스레드 프로그램은 동시에 교대 작업이 이루어진다. 
 */
public class ThreadEx07 {
	public static void main(String[] args)throws Exception {
		String cityName = JOptionPane.showInputDialog("도시이름 입력>>");
		System.out.println("입력한 도시이름: "+cityName);
		
		for(int i = 10; i>=1; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);//1초간 잠시 쉰다. 즉 일시정지
			}catch(Exception ie) {}
		}
	}
}
 