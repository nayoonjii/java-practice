//업캐스팅 이후 오버라이딩 한 메서드 호출

class Father05{
	void f05() {
		System.out.println("부모클래스 f05()");
	}
}

class Son05 extends Father05{

	@Override
	void f05() {
		System.out.println("오버라이딩 한 메서드 ");
	}
	void s05() {
		System.out.println("자손클래스에서 정의된 메서드 s05()");
	}
}

public class CastEx05 {

	public static void main(String[] args) {
		Father05 f = new Son05();//업캐스팅
		f.f05();//메서드가 오버라이딩 된 경우는 f가 가리키는 객체타입에 의해서 호출되는 메서드가 결정됨. 업캐스팅이후 
		//오버라이딩 한 메서드 호출
		
		Father05 f2 = new Father05();
		f2.f05();//부모클래스에서 정의된 메서드 호출
		
		Son05 s;
		s = (Son05)f;//사전에 업캐스팅을 했기 때문에 명시적인 다운캐스팅
		s.f05();//오버라이딩한 메서드 호출
		s.s05();//자손에 정의한 메서드 호출
		
	}

}
