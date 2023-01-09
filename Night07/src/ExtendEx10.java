class Parent10{//extends Object생략
	int a = 10;
	
}

class Child10 extends Parent10{
	int a = 20;
	
	void method() {
		/*부모클래스와 자손클래스에 동일 멤버변수가 정의된 경우 부모로 부터 상속받은 멤버변수에 접근할려면
		 * super.변수명 으로 접근한다. 자손에서 정의된 변수에 접근할 때는 this.변수명으로 접근하면 도니다. 
		 * this.은 생략가능하다.
		 */
		
		System.out.println("a = "+a);
		System.out.println("this.a = "+this.a);
		System.out.println("super.a = "+super.a);
		
	}
}
public class ExtendEx10 {

	public static void main(String[] args) {

		Child10 ch10 = new Child10();
		ch10.method();
		
	}

}
