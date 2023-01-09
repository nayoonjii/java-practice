import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//플로우 레이아웃 배치관리자 실습
class Frame02 extends Frame{
	public Frame02() {
		setLayout(new FlowLayout());//플로우 레이아웃 배치관리자 설정
		//플로우 레이아웃은 컨테이너안에 컴포넌트를 왼쪽에서 오른쪽으로 위에서 아래로 물 흐르듯
		//자연스럽게 배치한다.
		
		add(new Button("Button 01"));//프레임 윈도우에 버튼추가
		add(new Button("Button 02"));
		add(new Button("Button 03"));
		add(new Button("Button 04"));
		add(new Button("Button 05"));
		
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			
		});//프레임 윈도우 이벤트 등록 => 익명클래스
		
	}//생성자
}
public class AwtEx02 {
	public static void main(String[] args) {

		new Frame02();//생성자 호출
	}

}
