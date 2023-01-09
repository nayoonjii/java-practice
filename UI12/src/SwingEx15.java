import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

//방향키를 누르면 자동차 이미지가 위로, 아래로, 좌로, 우로 이동하는 실습
class MyPanel15 extends JPanel{
	BufferedImage img = null;//이미지를 임시 메모리에 임시저장 =>버퍼링
	int img_x = 100;//x좌표
	int img_y = 100;//y좌표
	
	public MyPanel15() {
		try {
			img = ImageIO.read(new File("./images/car2.png"));
			//이클립스에서 인식하는./ 현재경로는 프로젝트 경로 =>상대경로
		}catch(IOException ie) {
			System.out.println("no image");
			System.exit(1);
			/* System.exit(0)은 정상적인 종료
			 * System.exit(1)은 비정상적인 종료
			 */
			
		}//try~catch문은 예외처리
		
		//ㅋㅣ보드 이벤트 등록
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {//좌상단이 0,0
				int keycode = e.getKeyCode();//키코드값을 구함
				switch(keycode) {
				 case KeyEvent.VK_UP://위로가는 방향키
					 img_y -= 50; break;//y좌표가 10감소
				 case KeyEvent.VK_DOWN://아래로가는 방향키
					 img_y += 50; break;
				 case KeyEvent.VK_LEFT://d왼쪽으로 가는방향키
					 img_x -= 50; break;
				 case KeyEvent.VK_RIGHT://오른쪽으로 가는 방향키
					 img_x += 50; break;
				}
				repaint();// 다시그리고자 그리기 메서드 호출
			}//키보드를 아래로 눌렀을때 호출
			
		});//익명클래스 문법으로 이벤트를 처리 -> 외부클래스$번호(익명클래스 순번).class
		
		this.requestFocus();//this는 스윙패널을 의미하고 포커스를 요청
		setFocusable(true);//패널이 포커스를 받을 수 있게 한다.
	}//생성자

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);//부모 메서드 호출
		g.drawImage(img, img_x, img_y, null);//해당 이미지를x,y 좌표에 그린다.
	}//무엇을 그리고자 그리기메소드 오버라이딩	
	
}
public class SwingEx15 extends JFrame{
	public SwingEx15() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel15());
		setVisible(true);
	}
	
	
	public static void main(String[] args) {

		new SwingEx15();
	}

}
