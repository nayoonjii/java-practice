import java.util.Scanner;

public class OprEx12 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("주민번호 입력.(801025-1111222)>>");
		String jumin=scan.nextLine();
		char jumin2=jumin.charAt(7);//charAt(7)메서드는 첫문자를 0부터 시작하고 8번째 즉 주민번호 뒤자리 첫 단일문자를 구함.
		
		switch(jumin2) {
		 case '1': case '3':
			 switch(jumin2) {
			   case '1':
				   System.out.println("2000년 이전에 태어난 남자");
				   break;
				   
			   case '3':
				   System.out.println("2000년 이후에 태어난 남자");
				   break;
			 }//inner switch ~ case
			 break;
			 
		 case '2': case '4':
			 switch(jumin2) {
			   case '2':
				   System.out.println("2000년 이전에 태어난 여자");
				   break;
				   
			   case '4':
				   System.out.println("2000년 이후에 태어난 여자");
				   break;
			 }
			 break;
			 
		 default:System.out.println("유효하지 않은 주민번호 입니다.");	 
		}//outer switch~case
	}
}



