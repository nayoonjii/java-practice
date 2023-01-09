class Parent12{
	protected int a,b,c;
	
	public Parent12(){
		super();//생략가능. Object의 기본생성자를 호출
		System.out.println("Parent12클래스의 기본생성자 호출");
	}
	
	public Parent12(int a, int b, int c) {
		System.out.println("Parent12 클래스의 전달인자 3개짜리 오버로딩 된 생성자 호출");
		this.a = a; this.b = b; this.c = c;
		
	}//생성자 오버로딩
}//부모클래스

class Child12 extends Parent12{
	public Child12() {
		System.out.println("Child12 클래스 기본생성자 호출");
	}
	
	public Child12(int a, int b, int c) {
		super(a,b,c);//부모의 오버로딩 된 생성자를 호출
		System.out.println("Child12 전달인자 3개짜리 생성자 호출");
	}
	void print() {
		System.out.println("a = "+a+", b = "+b+", c = "+c);
	}
}

public class Ex16_3 {

	public static void main(String[] args) {
		Child12 ch = new Child12();
		Child12 ch2 = new Child12(10,20,30);
		ch2.print();
		
	}

}
