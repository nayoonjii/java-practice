class Point2D{
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}//부모클래스

class Point2D_1 extends Point2D{
	private int z;

	public int getZ() {
		return z;
	}//getter() 메서드

	public void setZ(int z) {
		this.z = z;
	}//setter() 메서드
	
	
}
public class ExtendEx02 {

	public static void main(String[] args) {

		Point2D_1 pt = new Point2D_1();
		
		pt.setX(10);//상속받아서 사용
		pt.setY(20);//상속받아서 사용
		pt.setZ(30);
		
		System.out.println("x좌표값 :"+pt.getX());//상속받아서 사용
		System.out.println("y좌표값 :"+pt.getY());//상속받아서 사용
		System.out.println("z좌표값 :"+pt.getZ());//자신의 것 사용
		
	
	}

}
