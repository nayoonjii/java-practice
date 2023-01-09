import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//스윙으로 한줄 입력 박스 컴포넌트 만들기

public class SwingEx11 {
	public static void main(String[] args) {

		JFrame f = new JFrame();
		JPanel panel = new JPanel();//패널은 여러개의 컴포넌트를 하나의 묶음으로 묶어서 배치하는 컴포넌트
		// 즉 레이아웃이다.
		f.add(panel);//프레임 윈도우에 패널을 추가
		
		JLabel label01 = new JLabel("섭씨온도");//JLabel은 설명을 덧붙일때 사용
		JLabel label02 = new JLabel("화씨온도");
		JTextField field01 = new JTextField(15);//JTextField는 한줄 입력필드를 만든다.
		//생성자 인자값 15는 입력박스 길이
		JTextField field02 = new JTextField(15);
		JButton button = new JButton("변환");
		
		panel.add(label01);
		panel.add(field01);
		panel.add(label02);
		panel.add(field02);
		panel.add(button);//패널에 각 컴포넌트를 추가
		
		f.setSize(300,150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("온도 변환기");
		f.setVisible(true);
		
		/* 1. JFrame 스윙 프레임 윈도우 컨테이너는 보더레이아웃이 기본 배치관리자이다.
		 * 2. JPanel 스윙 패널 컨테이너는 플로우 레이아웃이 기본 기본 배치관리자이다.
		 */
		
	}

}
