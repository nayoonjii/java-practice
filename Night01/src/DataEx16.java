public class DataEx16 {
	public static void main(String[] args) {

		char ch='Z';
		String result="";
		
		result=('A' <= ch && ch <= 'Z')?"영문 대문자":"영문 소문자";
		
		System.out.println(ch+"는 "+result);
		
		int a=10;
		a=a+10;//10 증가
		System.out.println(a);
		
		a+=5;//5증가, a=a+5와 같다.
		System.out.println(a);//25
	}
}
