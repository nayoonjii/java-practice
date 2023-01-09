import java.util.Scanner;
//다음 자바소스에서 switch ~ case문을  if else if 다중조건문과 ||(논리합) 연산, 그리고 ==(같다) 연산을 활용한 코드로 변경
public class Test1 {
	public static void main(String[] args) {
		int month = 0;
		
		System.out.print("현재 월을 입력>>");
		
		Scanner scan=new Scanner(System.in);
		month=Integer.parseInt(scan.nextLine());
		
        if (month == 12 || month <=2) {
            System.out.println(month + "월은 겨울입니다. ");
        } else if     (month <= 5 && month > 2) {
            System.out.println(month + "월은 봄입니다. ");
        }
        else if (month <= 8 && month > 5){
            System.out.println(month + "월은 여름입니다. ");
        }
        else if (month <= 11 && month > 8) {
            System.out.println(month + "월은 가을입니다. ");
        }
        else 
            System.out.println("아무것도 아닙니다.");
        
        scan.close();
   	}
		
}


