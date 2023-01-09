import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//이벤트 처리하는 방법1 = 이벤트 처리 클래스를 별도로 만들어서 이벤트를 처리
class Frame06 extends Frame{
	Button redBtn, blueBtn;// 클래스 소속 멤버변수 2개 선언
	
	public Frame06() {
		setLayout(new FlowLayout());//플로우 레이아웃 배치관리자 생성
		
		redBtn = new Button("RED Button");
		blueBtn = new Button("BLUE Button");
		
		add(redBtn); add(blueBtn); // 프레임 윈도우 버튼추가
		
		ButtonListener listener = new ButtonListener();//이벤트 처리 객체생성
		redBtn.addActionListener(listener);
		blueBtn.addActionListener(listener);//2개의 버튼 이벤트 등록
		
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			
		});
		
	}//생성자
}//Frame06

//이벤트 처리 클래스 별도 정의
class ButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 클릭되었다.");
	}//이벤트가 발생하면 호출
	
}
public class AwtEx06 {
	public static void main(String[] args) {
		new Frame06();

	}

}
