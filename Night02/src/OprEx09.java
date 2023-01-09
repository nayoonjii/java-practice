import java.util.Scanner;

public class OprEx09 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("정수 숫자 입력>>");
		int number=Integer.parseInt(scan.nextLine());
		
		/*문제) 입력받은 정수숫자를 가지고 0인지 아닌지 판별하는 프로그램을 만들어 보자.
		 * if~else조건문을 활용한다.
		 */
		
		if(number != 0) {
			System.out.println(" 0이 아닙니다.");
		}else {
			System.out.println("영입니다.");
		}
	}
}
