import java.util.Scanner;

public class OprEx03 {
	public static void main(String[] args) {

		int num=-7;
		
		if(num<0) {//if(else)문 뒤에 나오는 실행문장이 한줄 인경우는 {}블록해도 되고 안해도 된다. 
			//한줄이상인 경우는 {}블록단위를 꼭해야 함께 실행된다.
			num=-num;
		}
		
		System.out.println("-7의 양의 절대값 = "+num);
		System.out.println("====================");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 숫자 입력>>");
		
		int number=scan.nextInt();//정수 숫자로 입력
		
		if(number % 2 == 0) {
			System.out.printf("%d은(는) 짝수이다.", number);
		}else {
			System.out.println(number+"는 홀수이다.");
		}
	}
}
