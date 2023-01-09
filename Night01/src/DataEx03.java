public class DataEx03 {
	public static void main(String[] args) {

		char x='A';
		System.out.printf("%c -> %d \n", x, (int)x);//%c는 단일문자 출력형태 지시자, %d는 십진수 정수 출력형태
		//(int)캐스팅 형변환 연산자,\n은 줄 바꿈
		
		x='a';
		System.out.printf("%c -> %d \n", x, (int)x);
		
		String cityName="서울시";//String은 문자열 참조 타입
		System.out.println("도시 이름 : "+ cityName);
	}
}
