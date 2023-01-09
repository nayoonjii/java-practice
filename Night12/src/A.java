//인스턴스 멤버 내부 클래스, 정적멤버 내부클래스, 지역 내부클래스
public class A {//외부클래스 A
	
	A(){ System.out.println("A 객체가 생성됨");	}
	
	/*인스턴스 멤버 내부클래스 => 외부클래스명$내부클래스명.class(A$B.class)
	 * 인스턴스 멤버 내부에는 인스턴스 변수와 인스턴스 메서드만 올수있다. 정적변수와 정적메서드는 올수 없다.
	 */
	public class B{
		B(){ System.out.println("B 객체가 생성됨");}
		
		int field1;
		//static int field2;
		void method1() {}
		//static void method2() {}
	}//A$B.class
	
	/* 정적멤버 내부클래스 특징)
	 * 1. static키워드로 정의된다.
	 * 2. 인스턴스변수, 인스턴스 메소드, 정적변수, 정정메서드 까지 모두 올수가 있다. 
	 */
	
	static class C{
		C(){System.out.println("C 객체가 생성됨");}
		int field1;//인스턴스 변수
		static int field2;//정적변수
		void method1() {}//인스턴스메서드
		static void method2() {}//정적메서드
	}//A$C.class
	
	void method() {
		/* 지역 (로컬) 내부클래스 특징)
		 * 1. 인스턴스 변수 , 인스턴스 메서드만 올수있다. 정적변수와 정적메서드는 올수가 없다.
		 * 2. 외부클래스명$번호내부클래스명.class(A$번호(지역클래스 순번)C.class)
		 */
		class D{
			D(){System.out.println("D객체가 생성됨");}
			int field1;
			//static int field2
			void method1() {}
			//static void method2(){}
		}//A$1D.class
		D d = new D();
		d.field1 = 3;
		d.method1();

	}

}
