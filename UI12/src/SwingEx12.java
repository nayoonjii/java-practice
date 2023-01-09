import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//그리드 레이아웃 배치관리자 실습
class MyFrame12 extends JFrame{
	
	public MyFrame12() {
		setTitle("그리드 레이아웃 연습");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0,3));
		/* 3개의 열을가지고 필요한 만큼의 행을 가지는 그리드 레이아웃 배치관리자 설정 
		 * 행을 0으로 지정하면 가변적으로 늘어난다.
		 */

		add(new JButton ("Button01"));
		add(new JButton ("Button02"));
		add(new JButton ("Button03"));
		add(new JButton ("B4"));
		add(new JButton ("Long Button05"));
		
		pack();//프레임 윈도우에 소속된 각 컴포넌트들의 크기에 맞게 조절 setSize지정안해서 프레임에 맞게 조절됨
		setVisible(true);
		
	}
	
	
}
public class SwingEx12 {
	public static void main(String[] args) {

		new MyFrame12();
	}

}
