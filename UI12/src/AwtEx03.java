import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 보더 레이아웃 배치관리자 실습
class Frame03 extends Frame{
	public Frame03() {
		setLayout(new BorderLayout());//보더레이아웃 배치관리자 설정
		
		add(new Button("Button01"),"North");//프레임 윈도우 북쪽에 버튼추가
		add(new Button("Button02"),"West");//서쪽에 버튼추가
		add(new Button("Button03"),"Center");//보더레이아웃 배치관리자로 중앙에 버튼추가
		add(new Button("Button04"),"East");
		add(new Button("Button05"),"South");
		
		setSize(300,200);//프레임 윈도우 폭과 높이 지정(AWT)
		setVisible(true);//항상 보이게 하기
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			
		});//윈도우 이벤트 등록
		
		
	}
}
public class AwtEx03 {
	public static void main(String[] args) {

		new Frame03();//생성자 호출
		
	}

}
