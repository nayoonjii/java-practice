import java.util.Scanner;

public class Ex06_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/* 1.이클립스 임포트 단축키 : ctrl+ shift+영문자 o
		 * 2. Scanner 클래스는 무엇을 입력받기 위한 api로 자바 5(jdk 1.5)버전에서 추가된 것이다ㅣ.
		 * 3. System.in 은 키보드 입력장치와 연결
		 */
		
		System.out.println("반복할 횟수 입력>>");
		String inputCount=scan.nextLine();//문자열로 입력받음
		int numberCount = Integer.parseInt(inputCount);//입력받은 문자열을 정수 숫자로 변경
		
		System.out.println("반복할 문자 입력>>");
		String inputString = scan.nextLine();
		
		for(int i=1;i<=numberCount;i++) {
			System.out.print(" "+i+"번"+inputString);//+는 문자열 연결 연산기호
		}
		
		

		
	}
}
