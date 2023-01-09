//인스턴스 멤버와 정적멤버 내부클래스 객체 생성법
public class Main {
	public static void main(String[] args) {
		
		A a = new A();//외부클래스 객체생성

		//인스턴스 멤버 내부클래스 객체 생성과정
		
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적멤버 내부클래스 객체 생성과정
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		a.method();

	}
}
