class St12{
	static int a = 10; //정적변수(클래스 변수)
	int b = 20;//인스턴스변수
	
	/*클래스 소속의 멤버변수(속성) 종류
	 * 1. static 예약어로 정의된 정적변수(클래스 변수): 정적변수는 해당 클래스로 직접 접근 가능하다. 물론 생성된 객체에 
	 * 	    의해서도 공유된다.
	 * 2. 인스턴스 변수: 객체를 생성해서 접근한다. 그러므로 각 객체마다 주소 값이 달라서 다른값을 가질수 있다.
	 * 
	 * 클래스 소속 멤버변수 기본값 종류)
	 *  int 타입:0, long 타입: 0L, float 타입: 0.0f, double타입: 0.0, boolean타입:false,
	 *  참조타입:null
	 */
}
public class ClassEx12 {

	public static void main(String[] args) {

		System.out.println("St12.a: "+St12.a);//정적변수는 클래스명. 정적변수로 접근 가능하다.
		//System.out.println("St12.b: "+St12.b);//인스턴스변수는 해당 클래스로 직접 접근 못함.
		
		St12 s01 = new St12();//생성된 객체명 s01과 s02는 객체주소값이 다르다.
		St12 s02 = new St12();
		
		s01.a = 1000;//정적변수값은 생성된 모든 객체에 의해서 공유된다.
		System.out.println("s01.a = "+s01.a+", s02.a = "+s02.a);
		
		s01.b = 2000;//인스턴스변수는 각체 주소가 다르다. 다른값을 가질 수 있다.
		System.out.println("s01.b = "+s01.b+", s02.b = "+s02.b);
		
		
	}

}
