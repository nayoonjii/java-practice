public class DataEx02 {
	/* 키워드 종류)
	 *  1.public : 누구나 다 접근할 수 있는 접근 권한 제어자
	 *  2.class :클래스명 정의. 클래스명 첫글자는 반드시 영문대문자로 하는 것이 관례화 되어 있다. 소문자로 하지 말아야 한다.
	 *  3.static : 해당 클래스명으로 직접 접근하는 정적 즉 클래스 메서드를 정의할 때 사용.
	 *  4.void : 반환값이 없는 자료형. 리턴 타입이 없다.
	 */
	public static void main(String[] args) {

		int a; //자료형 변수명; 으로 변수 선언, ;(세미클론)은 한문장 끝을 의미
		a=10;//=은 대입 할당 연산자로 오른쪽값을 왼쪽 변수에 대입
		System.out.println("a="+a);
		
		a=20;
		System.out.println("a="+a);//20
		
		short b=128;
		int c=32768;
		
		b=(short)c;//4바이트의 int타입 변수값이 2바이트의 크기의 b변수에 저장될때는 값의 손실위험이 있어서 묵시적인 자동형변환을 해주지
		//않는다.이런 경우는 명시적인 캐스팅 연산자 인 형변환 연산자를 활용해서 형변환을 해야 한다.(short)=>캐스팅 연산자 .
		//short타입 최대값 범위를 벗어난 오버플로우 현상이 발생해서 short타입 최소값이 출력된다.
		
		System.out.println("b="+b);//-32768
		
		byte d=10;
		b=d;//더 큰타입에 저장되기 때문에 값 손실 위험이 없다. 이런경우는 자바 컴파일러가(javac.exe) 자동형 변환을 해 준다.그러므로
		//캐스팅 연산자를 사용하지 않아도 된다.
		
		System.out.println("b="+b);
		System.out.println("===================>");
		
		double e=23.7;//값뒤에 접미사 d 또는 D가 생략됨		
		float f=23.7f;
		double g=100.3d;
		
		System.out.println("float타입 실수값 = " + f);
		System.out.println("double타입 실수값 = " + e);
	}
}




