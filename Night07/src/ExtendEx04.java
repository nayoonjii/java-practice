class Parent04{
	public void p04() {
		System.out.println("부모클래스 메서드p04()");
	}
}

class Child04 extends Parent04{

	@Override
	public void p04() {
		System.out.println("오버라이딩 한 메서드 p04()");
	}
	/*메서드 오버라이딩 이란?
	 * 1. 상속관게에서 부모클래스 메서드명, 메서드 리턴타입, 매개변수 개수, 전달인자(매개변수) 타입 동일한 원형을 그대로
	 * 	    자손으로 상속받은 상태에서 자손 클래스에 맞게{}내의 본문 실행문장을 변경하는것을 오버라이딩 이라고 한다.
	 * 2. 오버라이딩을 할려면 사전에 상속관게를 먼저 만들어야 한다.
	 * 3. 생성자는 상속이 되지 않기 때문에 생성자 오버라이딩이란 문법은 없다.
	 */
	
	public void ch04() {
		System.out.println("자손클래스에서 정의된 메서드ch04()");
	}
	
}
public class ExtendEx04 {

	public static void main(String[] args) {
		
		Child04 ch04 = new Child04();
		ch04.p04();//오버라이딩 한 메서드를 호출
		ch04.ch04();//자손에서 추가된 메서드를 호출
		
		Parent04 p04 = new Parent04();
		p04.p04();//부모에서 정의된 메서드를 호출

	}

}
