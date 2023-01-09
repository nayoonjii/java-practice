import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
//마우스로 자동차 이동 실습
class MyPanel16 extends JPanel{
	BufferedImage img = null;//읽어들인 이미지를버퍼링
	int img_x = 0, img_y = 0;
	
	public MyPanel16() {
		try {
			img = ImageIO.read(new File("./images/car.png"));
		}catch(IOException ie) {
			System.out.println("해당 자동차이미지가 없다");
			System.exit(1);
		}
		//마우스 이벤트 등록
		addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				img_x = e.getX();//x좌표
				img_y = e.getY();//y좌표
				repaint();//다시그리고자 그리기 메서드를 호출
			}//마우스를 눌렀을때 호출
			
		});//익명클래스 문법
	}//생성자

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img, img_x, img_y, null);//null은 해당 이미지가 제대로 그려지는지 지켜보는 관찰자.
		//null은 관찰자가 없다.
	}//무엇을 그리고자 호출
	
	
	
}//MyPanel16
public class SwingEx16 extends JFrame{
	public SwingEx16() {
		add(new MyPanel16());// 스윙 프레임 윈도우에 패널을 추가
		setSize(700,700);
		setTitle("마우스 클릭으로 자동차이미지 이동하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {

		new SwingEx16();
	}

}
