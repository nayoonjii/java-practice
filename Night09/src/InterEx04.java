/* 인터페이스의 특징)
 * 1. 인터페이스는 interface예약어로 정의한다.
 * 2. 인터페이스는 new연산 키워드로 객체생성을 못한다.
 */
interface IHello4{//최초작성한 인터페이스의 조상은 없다.
	void sayHello(String name);//public abstract이 생략된 추상메서드. 추상메서드는{}가 없고, 실해문장이 없고,
	//호출이 불가능
	
}

class Hello4 implements IHello4{//class 자손 클래스 implements 부모 인터페이스 => 자손클래스에서 implements
	//키워드로 부모 인터페이스를 구현상속을 받는다.

	@Override
	public void sayHello(String name) {
		System.out.println(name+"씨 안녕~");
	}
	//부모인터페이스를 구현 상속받은 자손클래스에서 부모의 추상메서드를 반드시 오버라이딩을 해야 한다는 강제성이 부여된다.
}
public class InterEx04 {

	public static void main(String[] args) {

		Hello4 h4 = new Hello4();
		h4.sayHello("홍길동");
		
		
		IHello4 ih ;//인터페이스로 참조변수 선언가능
		ih = new Hello4();//부모타입으로 업캐스팅이 가능함
		
		ih.sayHello("홍길동");//업캐스팅 이후 오버라이딩 한 메서드를 호출
	}

}
