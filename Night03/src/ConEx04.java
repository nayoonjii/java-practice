import java.util.Scanner;

public class ConEx04 {
	public static void main(String[] args) {

		int inputNumber=0;
		int answer=0;
		
		answer=(int)(Math.random()*100)+1;//random()메서드는 0.0이상 1.0미만 사이의 실수 숫자 난수를 발생한다.여기에 *100을 하면
		//0.0이상 100.0미만->(int)로 형변환을 하면 소수점 이하는 버리고,0이상 100미만 -> +1을 하면 1이상 101미만,즉 1부터 100사이의 정수 
		//숫자 난수를 발생시킴.
		
		Scanner scanner=new Scanner(System.in);
		
		do {
			System.out.print("1부터 100사이 정수 입력>>");
			inputNumber=Integer.parseInt(scanner.nextLine());
			
			if(inputNumber>answer) {
				System.out.println("더 낮은 수를 입력하세요!");
			}else if(inputNumber < answer) {
				System.out.println("더 높은 수를 입력하세요!");
			}
		}while(inputNumber != answer);//입력한 수와 난수가 같으면 반복문 종료
		
		System.out.println("정답입니다!");
	}
}
