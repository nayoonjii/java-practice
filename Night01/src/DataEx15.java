import java.util.Scanner;

public class DataEx15 {
	public static void main(String[] args) {
/* 3항 조건연산자 특징)
 * 조건식?조건식이 참이면 실행: 조건식이 거짓이면 실행;
 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("나이값 입력>>");
		String ageNumber=scan.nextLine();//문자열로 입력 받는다.
		int age=Integer.parseInt(ageNumber);//문자열을 정수 숫자로 변경
		
	    String result="";
	    result=(age >= 10 && age <= 19)?"10 대": "10대 아님";
	    
	    /* &&(논리곱) 연산: 2개의 입력값이 모두 참이면 결과값은 참이다. 나머지는 거짓이다. 
	     */
	    System.out.println("입력하신 나이 "+age+"살은 "+result);
	    System.out.println("=================>");
	    
	    int a=5,b=10;
	    int max=(a>b)?a:b;
	    System.out.println(max);
	}
}
