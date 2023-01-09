import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//getActionCommand()메서드 사용예
class Frame07 extends Frame{
	Button orangeBtn, yellowBtn;
	
	public Frame07() {
		setLayout(new FlowLayout());//플로우 레이아웃 배치관리자 설정
		
		//2개의 버튼객체 생성
		orangeBtn = new Button("Orange Color");
		yellowBtn = new Button("Yellow Color");
		add(orangeBtn);// 프레임 윈도우에 버튼추가
		this.add(yellowBtn);//this. 생략가능
		
		//이벤트 처리객체 생성
		ButtonListener2 handler = new ButtonListener2(this);
		orangeBtn.addActionListener(handler);
		yellowBtn.addActionListener(handler);
		
		setSize(420,400);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			
		});
		
		
	}//생성자
}//Frame07

//별도로 이벤트를 처리하는 클래스 정의
class ButtonListener2 implements ActionListener{
	Frame f = null;
	
	public ButtonListener2() {}
	
	public ButtonListener2(Frame f) {
		this.f = f;
	}//생성자 오버로딩
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()==("Orange Color")) {
			f.setBackground(Color.orange);//프레임 배경색을 오랜지 색으로 설정
		}else {
			f.setBackground(Color.yellow);
		}
	}//이벤트가 발생할때 호출
	
}

public class AwtEx07 {
	public static void main(String[] args) {
		new Frame07();
	}

}
