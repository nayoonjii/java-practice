import java.util.Scanner;

public class OprEx05 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.print("정수 숫자 입력>>");
		int number=Integer.parseInt(scan.nextLine());
		
		System.out.print(number+"는 ");
		if(number == 0) {
			System.out.println(" 0 입니다.");
		}else if(number > 0) {
			System.out.println(" 양수 입니다.");
		}else {
			System.out.println(" 음수 입니다.");
		}
		
		System.out.println("=======================>");
		
		System.out.print("점수 입력>>");
		int score = Integer.parseInt(scan.nextLine());
		char grade=' ';
		System.out.print(score+"은(는) ");
		
		if(score>=90 && score<=100) {
			grade='A';
		}else if(score>=80 && score<=89) {
			grade='B';
		}else if(70 <= score && score <= 79) {
			grade='C';
		}else if(60 <= score && score<=69) {
			grade='D';
		}else {
			grade='F';
		}
		
		System.out.printf("%c학점입니다.",grade);
	}
}










