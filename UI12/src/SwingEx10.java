import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*스윙 ui컴포넌트를 생성
 * 1. 스윙 ui를 만들려면 javax.swing패키지를 임포트 해야한다.
 * 2. AWT컴포넌트에 영문 대문자 J를 붙이면 스윙 컴포넌트가 된다.
 */
class MyFrame10 extends JFrame{
	public MyFrame10() {
		setSize(600,450);//스윙 프레임 윈도우 폭을 300 높이가250
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//스윙 프레임 윈도우 창을종료
		setTitle("처음으로 하는 스윙으로 UI그리기");//스윙 프레임 윈도우에 제목을 설정
		
		setLayout(new FlowLayout());//플로우 레이아웃 배치 관리자 지정
		JButton button = new JButton("확인");//스윙 버튼을 생성
		this.add(button);//프레임에 버튼을 추가. this.생략가능
		setVisible(true);//항상보이게 한다.
	}//생성자 정의
}
public class SwingEx10 {
	public static void main(String[] args) {

		new MyFrame10();//생성자 호출
	}

}
