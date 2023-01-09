import java.util.Scanner;

public class OprEx07 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("관리자 등급 숫자 7~9사이 입력>>");
		String inputNumber=scan.nextLine();
		int inputNumber2=Integer.parseInt(inputNumber);
		
		if(inputNumber2>=7 && inputNumber2 <= 9) {
			System.out.println("입력하신 숫자 "+inputNumber+"는 ");
			
			switch(inputNumber) {
			 case "9": System.out.println("최고 관리자 등급");
			 case "8": System.out.println("중간 관리자 등급");
			 case "7": System.out.println("일반 관리자 등급");
			}
		}else {
			System.out.println("7부터 9사이 정수 입력하세요!");
		}
	}
}
