import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

//방향키를 누르면 자동차 이미지가 위로,아래로,좌로,우로 이동하는 실습
class MyPanel15_1 extends JPanel{
   BufferedImage img=null;//이미지를 임시 메모리에 임시저장=>버퍼링
   int img_x=100;//x좌표
   int img_y=100;//y좌표
   
   public MyPanel15_1() {
      try {
         img = ImageIO.read(new File("./images/car.png"));
         //이클립스에서 인식하는 ./ 현재경로는 프로젝트 경로=>상대경로
      }catch(IOException ie) {
         System.out.println("no image");
         System.exit(1);
         /* System.exit(0)은 정상적인 종료
          * System.exit(1)은 비정상적인 종료
          */
      }//try~catch문은 예외처리
      
      //키보드 이벤트 등록
      addKeyListener(new KeyAdapter() {

         @Override
         public void keyPressed(KeyEvent e) {
            int keycode=e.getKeyCode();//키코드 값을 구함
            switch(keycode) {
             case KeyEvent.VK_UP: //위로 가는 방향키 
                 img_y -= 10; break; //y좌표가 10감소
             case KeyEvent.VK_DOWN: //아래로 가는 방향기
                 img_y += 10; break;
             case KeyEvent.VK_LEFT: //왼쪽으로 가는 방향키
                 img_x -= 10; break; //x좌표가 10감소
             case KeyEvent.VK_RIGHT: // 오른쪽 방향키
                 img_x += 10; break;                 
            }
            repaint();//다시 그리고자 그리기 메서드 호출
         }//키보드를 아래로 눌렀을 때 호출         
      });//익명클래스문법으로 이벤트를 처리->외부클래스$번호(익명클래스순번).class(MyPanel15$1.
      //class)
      
      this.requestFocus();//this는 스윙 패널을 의미하고 포커스를 요청 
      setFocusable(true);//패널이 포커스를 받을 수 있게 한다.
   }//생성자

   @Override
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);//부모 메서드 호출
      g.drawImage(img, img_x, img_y, null);//해당 이미지를 x,y좌표에 그린다.
   }//무엇을 그리고자 그리기 메서드를 오버라이딩   
   
}
public class SwingEx15_1 extends JFrame{
   public SwingEx15_1() {
      setSize(500,500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(new MyPanel15_1());
      setVisible(true);
   }
   public static void main(String[] args) {
        new SwingEx15_1();
   }
}