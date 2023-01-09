class A{
	public A() {
		super();//생략가능함. 최고조상 Object클래스 기본생성자를 호출
		System.out.println("hello from a");
	}
}

class B extends A{
	public B() {
		super();//첫줄에 와서 가장먼저 부모의 생성자를 호출해야 한다.
		System.out.println("hello from b");
		//super(); 첫줄에 와서 먼저 부모의 기본 생성자를 호출해야 하는데 그렇지 못하고 두번째 줄 즉 첫줄다음에 와서 에러남
	}
}
public class Ex16_09 {

	public static void main(String[] args) {
		new B();
	}

}
