import java.util.Scanner;

public class ConEx03 {
	public static void main(String[] args) {

		int num;
		int sum=0;//누적합
		boolean flag=true;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("합계를 구할 숫자 입력.(끝내려면 0을 입력)");
		
		while(flag) {//반복문 무조건 참이어서 영원히 반복하는 문을 무한루프문이라고 한다.
			
			System.out.print(">>");
			num=scan.nextInt();//정수숫자로 입력
			
			if(num != 0) {
				sum+=num;//누적합
			}else {//0일때 실행
				flag=false;//반복문중단
			}
		}//while반복문 끝
		
		System.out.println("합계 = "+sum);
	}
}
