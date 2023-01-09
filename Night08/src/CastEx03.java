/*  다운캐스팅 전제조건)
 * 1. 사전에 업캐스팅을 하지 않아서 다운 캐스팅 예외 오류
 */
class Father03{
	void f03() {
		System.out.println("부모클래스 메서드 f03()");
	}
}

class Son03 extends Father03{
	void s03() {
		System.out.println("자손클래스 메서드 s03()");
	}
}

public class CastEx03 {

	public static void main(String[] args) {
		
		Father03 f = new Father03();
		Son03 s = (Son03)f;//사전에 업캐스팅을 하지않은 f는 정상적으로 컴파일은 되지만 컴파일된 바이트코드 클래스 파일
		//실행시 예외 오류를 던짐.
		
		s.f03();//상속받아서 호출
		s.s03();
		
	}

}
