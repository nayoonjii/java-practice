/* jdk 1.8부터는 인터페이스에 추상메서드 외에 디폴트메서드와 정적(클래스) 메서드가 추가적으로 올수있다.
 * 
 * 1. default 메서드가 추가된 이유: 부모 인터페이스에서 추상메서드가 추가되면 이 인터페이스를 상속받은 모든 자손에서 불필요한
 * 추상 메서드를 모두 오버라이딩을 해야하는 불편함이 있다. 이부분을 해결하기 위해서 추가된 것이 디폴트 메서드이다. 
 * 즉, 부모 인터페이스에 디폴트 메서드가 추가되어도 자손에서 필요하지 않으면 굳이 디폴트메서드를 오버라이딩 하지 않아도 된다.
 * 하지만 부모 인터페이스에서 디폴트 메서드가 중복정의된 경우에는 자손에서 오버라이딩을 해야한다.
 * 디폴트메서드 기본 접근 권한 제어자는 public이다. 그러므로 생략 가능하다.
 * 
 * 2. 정적메서드는 해당 인터페이스 이름으로 직접 접근가능하다. 정적메서드 역시 기본 접근 권한 제어자는 public 이고 , 생략가능함
 */

interface MyInterface{
	default void method01() {
		System.out.println("method01() in MyInterface");
	}
	
	default void method02() {
		System.out.println("method02() in MyInterface");
	}//디폴트 메서드 정의
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}//MyInterface

interface MyInterface2{
	default void method01() {//디폴트 메서드가 부모에서 중복해서 정의되면 자손에서 오버라이딩해야된다.
		System.out.println("method01() in MyInterface2");		
	}
	
	static void staticMethod() {//정적메서드 정의
		System.out.println("staticMethod() in MyInterface2");		
	}
}

class Parent13{
	public void method02() {
		System.out.println("method02() in Parent13");
	}
}//Parent13

class Child13 extends Parent13 implements MyInterface, MyInterface2{

	@Override
	public void method01() {
		System.out.println("Child13에서 method01() 오버라이딩");
	}
	/* 부모클래스의 메서드와 부모인터페이스의 디폴트메서드가 같은경우는 부모클래스의 메서드가 상속되고, 부모 인터페이스의
	 * 디폴트 메서드는 무시된다. 
	 */
	
}
public class InterEx13 {

	public static void main(String[] args) {
		Child13 ch = new Child13();
		ch.method01();
		ch.method02();//부모클래스 메서드가 상속
		
		MyInterface.staticMethod();
		MyInterface2.staticMethod();//인터페이스 이름.정적메서드

	}

}
