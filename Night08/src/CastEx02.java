class Father02{
	void f02() {
		System.out.println("부모클래스 메서드 f02()");
	}
}

class Son02 extends Father02{
	void s02() {
		System.out.println("자손클래스 메서드 s02()");
	}
}
public class CastEx02 {

	public static void main(String[] args) {
		
		Father02 f = new Son02();//업캐스팅
		f.f02();//부모에서 정의된 메서드 호출
		
		Son02 s = (Son02)f;//다운캐스팅
		/*다운캐스팅이란??
		 * 1. 상속관계에서 부모클래스형을 자손클래스형으로 변환하는 것을 말한다. 즉, 자손클래스 형으로 내리는 것을 말한다.
		 * 2. 다운캐스팅은 자동형변환을 해주지 않는다.
		 * 3. 다운캐스틴 할때 주의사항
		 * 		가. 사전에 반드시 상속관계를 만든다.
		 * 		나. 사전에 업캐스팅을 한것에 한해서만 다운캐스팅을 허용한다.
		 * 		다. 명시적인 형변환 즉 캐스팅 연산자를 사용해서 다운캐스팅을 해야한다.
		 */
		
		s.f02();//상속받아서 호출
		s.s02();//자손에서 정의된 것 호출
		
	}

}
