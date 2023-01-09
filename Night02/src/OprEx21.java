import java.util.Scanner;

public class OprEx21 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		/* 평가 문제)라인수 즉 줄수를 입력받아서 다음과 같이 출력되게 만든다.(이중 for반복문을 활용)
		 * 출력형태)  *
		 *          * *
		 *          * * *
		 *          * * * * 
		 *          * * * * *
		 */
		System.out.print("출력할 라인수를 입력>>");
		int lineNumber=Integer.parseInt(scan.nextLine());//문자열로 입력받아서 정수 숫자로 변경
		
		for(int i=1;i<=lineNumber;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}//inner for
			System.out.println();//줄바꿈
		}//outer for
	}
}
