import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame08 extends Frame implements ActionListener{
	
	Button redBtn, blueBtn;
	
	public Frame08() {
		setLayout(new FlowLayout());
		redBtn = new Button("RED");
		blueBtn = new Button("BLUE");//2개의 버튼 생성
		add(redBtn); add(blueBtn);
		
		redBtn.addActionListener(this);
		blueBtn.addActionListener(this);
		
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			
		});//내부 무명클래스(익명클래스) 문법으로 윈도우 닫기 이벤트 처리
	}//생성자

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==redBtn) {//getSource()메서드는 이벤트 발생소스 객체를 구함
			this.setBackground(Color.RED);
			
		}else{
			this.setBackground(Color.BLUE);
		}
	}//이벤트가 발생하면 호출
	
}


public class AwtEx08 {
	public static void main(String[] args) {
		new Frame08();//생성자 호출

	}

}
