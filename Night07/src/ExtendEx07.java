class Point7D{
	protected int x = 10;
	protected int y = 20;
	
	public Point7D() {
		super();//첫줄에서 가장먼저 부모 Object의 기본생성자를 호출. 생략가능
		System.out.println("부모클래스 Point7D 생성자");
	}
}

class Point7D_1 extends Point7D{
	protected int z = 30;
	
	public Point7D_1() {
		//super()가 생략됨
		System.out.println("자손클래스 Point7D_1 생성자");
	}
	
	public void pr() {
		System.out.println("x = "+x+", y = "+y+", z = "+z);
	}
}
public class ExtendEx07 {

	public static void main(String[] args) {
		Point7D_1 pt = new Point7D_1();//자손클래스 생성자 호출
		pt.pr();
		

	}

}
