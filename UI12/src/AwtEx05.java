import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/* Panel 컨테이너의 특징)
 * 1. AWT,Swing, Fx 로 ui를 그릴때는 패널 레이아웃을 기준으로 그리는 것이 나중에 유지보수에서 유리하다.
 * 2. 패너른 그림개체 즉 컴포넌트 (컨트롤)을 하나의 그룹으로 묶어서 효율적으로 레이아웃을 배칠할 수 있게한다.
 * 3. 결국 패널컨테이너는 여러개의 컴포넌트를 하나의 레이아웃으로 묶는 기능을 가진다.
 */
class Frame05 extends Frame{
	Panel pan01, pan02, pan03;
	
	public Frame05() {
		pan01 = new Panel();
		pan02 = new Panel();
		pan03 = new Panel();
		
		pan01.setBackground(Color.orange);//첫번째 패널 배경색을 지정
		pan02.setBackground(Color.blue);
		pan03.setBackground(Color.RED);
		
		add(BorderLayout.NORTH,pan01);//보더레이아웃 배치관리자로 북쪽에 첫번째 패널을 배치
		add(BorderLayout.CENTER,pan02);//보더레이아웃 배치관리자로 중앙에 두번째 패널을 배치
		add(BorderLayout.SOUTH,pan03);//보더레이아웃 배치관리자로 남쪽에 세번째 패널을 배치
		
		pan01.add(new Button("Button01"));
		pan01.add(new Button("Button02"));//첫번째 패널에 2개의 버튼 추가
		
		pan02.add(new Button("Button03"));
		
		pan03.add(new Button("Button04"));
		pan03.add(new Button("Button05"));
		
		setSize(300,150);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); System.exit(0);
			}
			
		});
	}//생성자
	
}
public class AwtEx05 {
	public static void main(String[] args) {

		new Frame05();
	}

}
