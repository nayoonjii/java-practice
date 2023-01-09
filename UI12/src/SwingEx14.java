import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//자바8에서 추가된 람다식을 사용한 이벤트 처리
class MyFrame14 extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame14() {
		this.setSize(300,200);//this.생략가능
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 예제");
		
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직버튼이 클릭되지 않았습니다.");
		
		button.addActionListener(e ->{//메서드명 , 리턴타입을 생략한 매개변수 e ->{}바로자바8에서 추가된
			//수학 힘수형 언어인 람다식이다.
			label.setText("마침내 버튼이 클릭되었다.");
		});//버튼이벤트 등록=> 람다식을 사용한 버튼이벤트 처리
		
		panel.add(button); panel.add(label);
		
		this.add(panel);
		setVisible(true);
		
	}
	
}
public class SwingEx14 {

	public static void main(String[] args) {

		new MyFrame14();
	}

}
