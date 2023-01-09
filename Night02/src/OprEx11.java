import java.util.Scanner;

public class OprEx11 {
	public static void main(String[] args) {

		int month=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("현재월을 입력>>");
		month=Integer.parseInt(scan.nextLine());//문자열로 입력받아서 정수숫자로 변경
		
		switch(month) {
		 case 3: case 4: case 5:
			 System.out.println("현재 계절은 봄");
			 break;
			 
		 case 6: case 7: case 8:
			 System.out.println("현재 계절은 여름");
			 break;
			 
		 case 9: case 10: case 11:
			 System.out.println("현재 계절은 가을");
			 break;
			 
		 default: System.out.println("현재 계절은 겨울");	 		 
		
		}
		
		 System.out.println("========================>");
		 /* 평가문제)
		  * 위의  switch ~case문을 if else if 다중조건문으로 변경해 보자. 논리연산자중에 ||을 사용하거나 다른 연산자를 활용해도 된다.
		  */
		 //풀이 코드 시작
		 String season="";
		 
		 System.out.printf("입력하신 %d월은 ",month);
		 if(month == 3 || month == 4 || month ==5) {
			 season="봄";
		 }else if(month>=6 && month <= 8) {
			 season="여름";
		 }else if(9<=month && month <= 11) {
			 season="가을";
		 }else {
			 season="겨울";
		 }
		 System.out.printf("%s입니다.", season);
	}
}















