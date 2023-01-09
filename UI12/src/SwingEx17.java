import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingEx17 extends JFrame implements ActionListener{
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public SwingEx17() {
		setTitle("이미지 레이블");
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		label = new JLabel("이미지를 보려면 아래 버튼을 누르세요.");
		
		button = new JButton("이미지 레이블");
		ImageIcon icon = new ImageIcon("./images/fruit.jpg");
		button.setIcon(icon);//버튼이미지
		button.addActionListener(this);//버튼이벤트 등록
		
		panel.add(label);
		panel.add(button);
		
		add(panel);//프레임윈도우에 패널추가
		setVisible(true);
				
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ImageIcon dogImage = new ImageIcon("./images/dog1.jpg");
		label.setIcon(dogImage);//레이블에 이미지 아이콘 객체 설정
		label.setText(null);
	}//이벤트 발생시 호출
	
	public static void main(String[] args) {
		new SwingEx17();
	}
}
