//인스턴스 멤버와 정적 멤버 내부클래스에서 외부클래스의 인스턴스 변수, 인스턴스 메서드, 정적변수, 정적메서드에
//접근법
public class A3 {
	int field1;//인스턴스 변수 
	void method1() {}//인스턴스 메서드
	
	static int field2;//정적변수
	static void method2() {}//정적메서드
	
	//인스턴스 멤버 내부 클래스 => 외부클래스의 인스턴스변수, 인스턴스 메서드, 정적변수, 정적메서드 모두 호출이 가능하다.
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}//A3$B/class

	//정적멤버 내부클래스 => 외부클래스의 인스턴스변수와 인스턴스 메서드는 접근 못하지만,
	//정적변수와 정적메서드는 접근가능하다.
	static class C{
		void method() {
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}//A3$C.class
}
