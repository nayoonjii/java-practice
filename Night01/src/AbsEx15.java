//추상클래스를 상속받은 자손에서 부모의 추상메서드를 오버라이딩을 하지 않으면 일반 클래스가 아닌 추상클래스이어야한다.
abstract class Abs15{
	abstract void m01();
	
	void m02() 
	{
		System.out.println("일반메서드 정의");
	}
}
abstract class MiddleClass extends Abs15{
	void m03() {
		System.out.println("일반메서드m03()");
	}
}
class SubClass15 extends MiddleClass{

	@Override
	void m01() {
		System.out.println("추상메서드 오버라이딩을 함");
	}
	
}

public class AbsEx15 {

	public static void main(String[] args) {

		SubClass15 sub = new SubClass15();
		sub.m01();
		sub.m02();
		sub.m03();
	}

}
