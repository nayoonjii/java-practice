import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/* AWT GUI를 생성한 다음 멀티 스레드로 애니메이션처럼 항상 지나가는 글자를 
 * 생성해 본다.
 */
class Thread05 extends Frame implements Runnable{
	int x = 1;
	
	Thread05(){
		setBackground(new Color(0,0,0));//RGB(red,green,blue) 0,0,0은 검정생
		//AWT프레임 윈도우 배경색을 검정으로 처리
		setSize(370,150);//프레임 윈도우 폭을 370,높이를150
		setVisible(true);//항상나오게 한다.
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); System.exit(0);//프로그램 종료
			}//윈도우 닫기 하면 호출			
		});//익명클래스 문법으로 이벤트 처리
	}//생성자
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);//스레드 일시정지
			}catch(InterruptedException ie) {}
				repaint();//다시그리고자 그리기 메서드 호출
				x +=5;//5씩 증가
					
		}
		
	}//스레드 문장 구현
	@Override
	public void paint(Graphics g) {
		Dimension d; //폭과 높이를 가지는 클래스
		d = getSize();
		g.setColor(Color.yellow);//글자색, 즉 전경색을 노랑으로 설정
		g.setFont(new Font("궁서",Font.BOLD,30));
		g.drawString("java", x, d.height/2);//프레임 높이의 절반정도의 높이에 지나가는 글자를 
		//Java를 그린다.
		/* 문제)Java문자가 프레임 폭을 벗어나면 다시 안나온다.그러므로 이부분을 수정해서 
		 *     다시 처음 부터 반복되게 만들어보자 
		 */
		if(x>d.width) {//프레임 폭을 벗어나면
			x = 1;
		}
			
	}//그리기 메서드	
}
public class ThreadEx05 {
	public static void main(String[] args) {
		Thread05 th = new Thread05();
		Thread t = new Thread(th);
		t.start();//스레드가 시작
	}
}
