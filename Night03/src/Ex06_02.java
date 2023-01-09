import java.util.Scanner;

public class Ex06_02 {

	public static void main(String[] args) {
		/* 추가문제) 또 다른 방법인 for, if, %연산 등을 활용해서 홀수 구하는 프로그램을 만들어보자.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("반복할 횟수입력>>");
		String count=scan.nextLine();
		int count = Integer.parseInt(scan.nextLine());
		
		//첫번쨰 홀수 구하는 법
		for(int i = 1; i<=count; i+=2) {
			System.out.println(" "+i);
		}
		System.out.println("\n===========>");
		
		//두번째 홀수 구하는 법
		for(int i=1;i<=count;i++) {
			if(i%2==1) {
				System.out.print(" "+i);
			}
		}
		

	}

}
