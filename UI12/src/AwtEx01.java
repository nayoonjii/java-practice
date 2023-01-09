import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
	/* java.awt패키지의 Awt로 UI작성 
	 */
class Frame01 extends Frame{
	public Frame01() {
		super("AWT ui");//AWT 프레임 윈도우 제목 설정
		setSize(300,300);//프레임 윈도우 폭과 높이 지정
		setVisible(true);//프레임윈도우 보이기
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();//자원해제
				System.exit(0);//프로그램종료->윈도우 종료
			}//윈도우 닫기하면 호출
			
		});//윈도우 이벤트 등록 메서드=> 익명클래스 문법으로 이벤트가 처리(외부클래스$번호.class)
	}//생성자

}
public class AwtEx01 {

	public static void main(String[] args) {

		new Frame01();//생성자 호출
	}

}
