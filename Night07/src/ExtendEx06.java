class Parent06{
	protected int a = 10;
	protected int b = 20;
	
}
class Child06 extends Parent06{
	protected int a =40;
	protected int b = 50;
	protected int c = 30;
	
	public void print() {
		System.out.println("a = "+a+",b = "+b+",c = "+c);
		System.out.println("super.a = "+super.a+",super.b = "+super.b+",super.c = "+this.c);
		//부모클래스와 자손클래스에서 동일한 멤버변수명이 정의된 경우 부모로 부터 상속받은 멤버변수에 접근하려면 super.
		//변수명 으로 접근한다. this.c에서this는 생략가능

	
	}
}

public class ExtendEx06 {

	public static void main(String[] args) {

		Child06 ch06 = new Child06();
		ch06.print();
		
	}

}
