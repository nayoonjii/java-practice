class Parent08{
	int x = 100;
	
	void method() {
		System.out.println("Parent08 method");
	}
}

class Child08 extends Parent08{
	int x = 200;

	@Override
	void method() {
		System.out.println("x = "+x);//this.x와같다.
		System.out.println("this.x = "+this.x);//this.은 생략가능함
		System.out.println("super.x = "+super.x);
		
		/*부모클래스와 자손에서 동일 멤버변수가 정의된 경우 부모로 부터 상속받은 멤버변수에 접근할려면 super.변수명으로 접근하고,
		 * 자손에서 정의된 변수에 접근할려면 this.변수명 으로 접근한다. 물론this.은 생략가능함
		 */
	}
	
}

public class CastEx08 {

	public static void main(String[] args) {

		Parent08 p08 = new Child08();//업캐스팅
		p08.method();
		
		Child08 ch08 = new Child08();
		ch08.method();
		
		
	}

}
