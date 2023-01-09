class Parent{
	protected int a;
			int b;
	protected int c;
	public int d;

}

class Child extends Parent{
	public Child(int a, int b, int c, int d) {
		this.a = a;//1번이 답이다=>a변수를 private로 선언해서 외부클래스에서 접근 못함.
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	void func() {
		System.out.println(a); //5번이답 이유 동일
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
public class Ex16_2 {

	public static void main(String[] args) {

		Child one = new Child(10,20,30,40);
		one.func();
	}

}
