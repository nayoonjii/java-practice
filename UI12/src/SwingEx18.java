import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//checkbox 네모버튼을 만든다. 체크박스는 한개 또는 한개이상을 동시설정이 가능하다.
public class SwingEx18 extends JPanel implements ItemListener{
	JCheckBox[] buttons = new JCheckBox[3];
	String[] fruits = {"apple","grapd","orenge"};
	JLabel[] pictureLabel = new JLabel[3];
	ImageIcon[] icon = new ImageIcon[3];
	
	public SwingEx18() {
		super(new GridLayout(0,4));//4개의 열을 가지고 필요한 만큼의 행을 가지는 그리드 레이아웃 설정
		for(int i = 0; i<3; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
			buttons[i].addItemListener(this);//3개의 체크박스 이벤트 등록
			pictureLabel[i] = new JLabel(fruits[i]+".jpg");
			icon[i] = new ImageIcon("./images/"+fruits[i]+".jpg");
		}//for
		
		JPanel checkPanel = new JPanel(new GridLayout(0,1));
		//첫번째 열에 체크박스 3개 추가
		for(int i = 0; i<3;i++) {
			checkPanel.add(buttons[i]);
		}		
		add(checkPanel);
		add(pictureLabel[0]);
		add(pictureLabel[1]);
		add(pictureLabel[2]);
	}//생성자
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getItemSelectable();//선택된 체크박스를 구함
		for(int i = 0; i<3; i++) {
			if(source == buttons[i]) {
				if(e.getStateChange() == ItemEvent.DESELECTED) {//체크박스가 선택 해제
					pictureLabel[i].setIcon(null);//레이블위의 이미지를지움
					pictureLabel[i].setText(fruits[i]+".jpg");//라벨위의 이미지 파일명 나오게설정
				}else {
					pictureLabel[i].setIcon(icon[i]);//레이블에 이미지 적용	
					pictureLabel[i].setText(null);//레이블위에 문자를 지움
				}//if else
			}//if
		}//for
	}//이벤트 사건이 발생할 때 호출

	public static void main(String[] args) {
		JFrame frame = new JFrame("체크박스 실습");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SwingEx18 panel = new SwingEx18();
		panel.setOpaque(true);//Jpanel은 기본 속성이 투명이다. 이것을 불투명하게 설정하는것
		frame.add(panel);
		frame.setSize(630,200);
		frame.setVisible(true);
	}
}
