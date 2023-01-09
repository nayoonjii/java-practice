import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//한개 이상의 추상메서드가 존재하는 리스너 인터페이스를 구현 상속받아서 불필요한 추상메서드가 오버라이딩을 
//하는 예제=> 컴파일에러는 아니지만 권장하지는 않는 방법

class Frame09 extends Frame implements WindowListener{
	
	public Frame09() {
		this.addWindowListener(this);//프레임 윈도우 이벤트 등록
		setSize(500,500);
		setVisible(true);
	}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose();//프레임 윈도우 창을 닫음
	
		System.exit(0);//프로그램 종료}
	}
	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}
	
}

public class AwtEx09 {
	public static void main(String[] args) {
		new Frame09();//생성자호출
	}

}
