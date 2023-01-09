public class DataEx14 {
	public static void main(String[] args) {
/* +연산자 특징)
 *  1.숫자+숫자는 덧셈을 한다.
 *  2.숫자+문자에서는 문자를 우선해서 숫자가 문자로 치환된다. 그래서 문자+문자 되어서 서로 연결한다.
 *  3.문자+문자에서는 +는 문자열 연결 연산 기호로 활용되어서 문자를 서로 연결한다. 
 */
	
	int a=10;
	int b=10;
	
	System.out.println(a+b);//20
	System.out.println(a+"10");//1010=>문자를 서로 연결
	System.out.println("10"+"20");//1020
	
	/* 비교(관계) 연산자 특징과 종류)
	 * 	1.비교 연산자 결과값은 boolean 타입이다.
	 *  2. >(~보다 크다), >=(~보다 크거나 같다), <(~보다 작다), <=(~보다 작거나 같다), ==(같다), !=(같지 않다.)
	 */
	boolean result=false;
	result=(10>6);
	System.out.println("10>6 : "+result);
	
	result=(a==b);
	System.out.println("10 == 10 : "+ result);
	
	result=(a != b);
	System.out.printf("%d != %d : %b",a,b,result);
	}
}




