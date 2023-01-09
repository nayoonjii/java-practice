class Point3D{//extends Object
	private int a=10;
	protected int b=20;
	
	
}

class Point3D_1 extends Point3D {
	protected int c=30;
	
	public void print() {
		System.out.println("a ="+a+", b = "+b+", this.c"+this.c);
		//부모클래스에서 private로 정의된 멤버변수는 외부에서 접근 못함.
		
	}
}
public class ExtendEx03 {

	public static void main(String[] args) {

		Point3D_1 p3 = new Point3D_1();
		p3.print();
		
	}

}
