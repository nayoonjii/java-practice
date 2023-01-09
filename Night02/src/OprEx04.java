import java.util.Scanner;

public class OprEx04 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번째 정수값 입력>>");
		int a= Integer.parseInt(scan.nextLine()); //문자열로 입력받아서 정수 숫자로 변경
		
		System.out.print("두번째 정수값 입력>>");
		int b=scan.nextInt();//정수 숫자로 입력
		
		int max=0;//최대값
		int min=0;//최소값
		
	    if(b>a) {
	    	max=b;
	    	min=a;
	    }else {
	    	max=a; min=b;	    			
	    }
	    
	    System.out.println("최대값 = "+max);
	    System.out.println("최소값 = "+min);
	}
}
