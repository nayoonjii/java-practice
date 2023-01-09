import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//자바 프로그래머에 의해서 임의의 위치에 스윙 컴포넌트 배치
class MyFrame13 extends JFrame{
	JButton b01;
	private JButton b02, b03;
	
	public MyFrame13() {
		setTitle("절대위치 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		JPanel p = new JPanel();
		p.setLayout(null);//패널의 배치관리자를 사용하지 않겠다는 뜻 임의의 위치에 배치
		
		b01 = new JButton("Button #1");
		p.add(b01);
		
		b02 = new JButton("Button #2");
		p.add(b02);
		
		b03 = new JButton("Buttpn #3");
		p.add(b03);
		
		b01.setBounds(20, 5, 95, 30);//x좌표가 20, y좌표가5, 버튼 너비가 95, 버튼 높이가30
		// 버튼이 임의의 x,y좌표위치에 배치
		b02.setBounds(55, 45, 105, 70);
		b03.setBounds(180, 15, 105, 90);
		
		add(p);
		setVisible(true);
	}//생성자
}
public class SwingEx13 {
	public static void main(String[] args) {

		new MyFrame13();
	}

}
