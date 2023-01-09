import java.util.Scanner;
/* 이클립스 단축키 ctrl+shift+영문자 o로 외부 패키지 폴더의 api를 읽어들임. import가 외부 패키지  api를 읽어들이는 예약어.
 */

public class DataEx06 {
	public static void main(String[] args) {

		int a=10;
		System.out.println(a);
				
		Scanner scan=new Scanner(System.in);
		/* Scanner 특징)
		 *  1.자바 5버전(jdk 1.5)에서 추가되었고,무엇을 입력받기 위한 api
		 *  2.System.in은 키보드 입력장치와 연결됨.
		 */
		
		System.out.print("나이 입력>>");
		String inputNumber=scan.nextLine();//문자열로 읽어들임
		int age=Integer.parseInt(inputNumber);//정수 숫자로 변경함.
		System.out.println("나이 : "+age);
		
		System.out.print("이름 입력>>");
		String name=scan.nextLine();
		System.out.println("이름 : "+name);
		
		scan.close();
	}
}
