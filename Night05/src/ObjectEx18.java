class Mt18{
	int year=2022;
	int month=5;
	int date=15;
}
public class ObjectEx18 {
	public static void main(String[] args) {

		Mt18 m=null;
		
		System.out.println(m.year+"년 "+m.month+"월 "+m.date+"일");
		//컴파일 단계에서는 에러가 안나고 실행시 예외 오류가 난다.java.lang.NullPointerException 예외 오류가 발생
	}
}
