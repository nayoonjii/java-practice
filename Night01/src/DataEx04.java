public class DataEx04 {
	public static void main(String[] args) {

		int year=2022;
		int age=28;
		
		System.out.println("년도 값 : " + year);
		System.out.println("나이 : " + age);
		
		int x=100;
		int y=200;
		int tmp=0;
		
		System.out.println("x="+x+",y="+y);
		//+는 문자열 연결 연산기호
		
		tmp=x;
		x=y;
		y=tmp;
		
		System.out.println("x="+x+",y="+y);
		
		int result=7+7;//숫자+숫자는 덧셈을 한다. 덧셈은 산술(수학) 연산자
		System.out.println(result);//14
		
		System.out.println("7"+7);//문자+숫자에서는 자바는 문자를 우선한다. 그래서 숫자가 문자로 치환 된다. "7"+"7"="77" 이 된다.
		//문자를 서로 연결한다.
		System.out.println(7+8);//15,숫자+숫자는 덧셈을 한다.
		System.out.println("10"+"20");//"1020", 문자+문자는 문자를 서로 연결한다.
	}
}
