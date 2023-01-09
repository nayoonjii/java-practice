class Point01{//extends Object생략
	int x,y;//멤버변수중 인스턴스 변수
	
	public Point01() {}
	
	public Point01(int x, int y) {
		this.x = x;
		this.y = y;
	}//생성자 오버로딩

	@Override
	public String toString() {
		return "x 좌표: "+x+", y 좌표: "+y;
	}
	
}
public class Object01 {

	public static void main(String[] args) {
		Point01 pt = new Point01(10,20);
		System.out.println(pt.toString());//.toString() 생략가능
		System.out.println(pt);
		System.out.println(new Point01(100,200));
	}

}
