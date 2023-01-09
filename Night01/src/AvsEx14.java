/*추상클래스를 상속받은 자손클래스는 부모 추상 클래스의 추상 메서드를 반드시 오버라이딩을 해야한다는 강제성 문법이 적용된다.
 * 그래야만 자손 클래스로 객체 생성이 가능하다. 만약 오버라이딩을 하지 않으면 자손도 추상클래스 이어야 한다. 
 */

abstract class Abs14{
	int a = 10;//추상클래스에서 일반변수 올수있다.
	abstract void m01();//abstract 키워드로 추상메서드 정의. 추상메서드는{} 가 없고, 실행문장이 없고, 호출이 불가능
	
	void m02() {
		System.out.println("추상클래스에서도 일반 메서드가 올수 있다.");
	}
	
}

class SubClass14 extends Abs14{

	@Override
	void m01() {
		System.out.println("추상메서드를 자손에서 일반메서드로 오버라이딩을 했다.");
	}
	
}
public class AvsEx14 {

	public static void main(String[] args) {
		Abs14 abs;//참조변수 선언가능
		abs = new SubClass14();//업캐스팅이 가능함
		abs.m01();//업캐스팅 이후 오버라이딩 한 메서드 호출
		
		SubClass14 sub = new SubClass14();
		sub.m01();
		
	}

}
