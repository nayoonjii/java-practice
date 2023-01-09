/* 지역(로컬)내부클래스 객체는 메서드 실행이 끝이나도 메모리에 남아서 계속 사용할수있다. 하지만 외부클래스의
 * 메서드 매개변수나 지역변수는 해당 메서드 호출이 끝나면 메모리에서 사라진다. 그러다보니 지역 내부클래스 객체를
 * 사용할 경우 값의 불일치 현상을 막기위해서 외부 클래스 매서드의 매개변수와 지역변수는 자바 7 까지는 값을 수정못하고
 * 명시적이 final 즉 상수이다. 자바8부터는 final 을 생략해도 상수로 인식된다. 
 */
public class Outter {

	//자바7이전 =>arg와 localVariable은 수정못하게 final인 상수
	public void method1(final int arg) {//arg가 매개변수
		final int localVariable = 1;//지역변수
		
		class Inner{//지역내부클래스
			public void method() {
				int result = arg+localVariable;
			}
		}//Outter%1Inner.class
	}
	
	//자바8 이후버전
	public void method2(int arg) {//int arg앞에 final이생략됨
		final int localVariable = 1;
		
		//arg = 10;
		//localVariable = 10;
		class Inner{
			public void method() {
				int result = arg+localVariable;
			}
		}//Outter$2Inner.class
	}
	
}
