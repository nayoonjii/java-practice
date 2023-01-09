class Parent01{//extends Object이 생략됨. 자바의 모든 클래스는 명시적인 상속을 받지 않으면 extends Object이다.
	//즉 자바 최상위 클래스Object으로 부터 상속받는다
	
	void p01() {
		System.out.println("부모클래스 메서드 p01()");
	}
	
}//부모클래스

class Child01 extends Parent01{
	/*클래스 상속 문법 형식)
	 * class 자손클래스 extends 부모클래스{
	 * 
	 * }
	 * 클래스 상속은 하나의 조상으로 부터 단일 상속만 가능하다.
	 */
	
	void ch01() {
		System.out.println("자손클래스 메서드ch01()");
	}
	
}

public class ExtendEx01 {

	public static void main(String[] args) {

		Child01 child01 = new Child01();
		
		child01.p01();//상속받아서 호출
		child01.ch01();//자손에서 정의된 메서드를 호출
		
		System.out.println("======================>");
		
		Parent01 p = new Parent01();
		p.p01();
		//p.ch01();//자손에서 추가된 메서드는 사용못함.
		
		
		
	}

}
