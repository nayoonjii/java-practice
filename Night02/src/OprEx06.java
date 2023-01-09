import java.util.Scanner;

public class OprEx06 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("0부터 100사이 점수 입력>>");
		int score=Integer.parseInt(scan.nextLine());
		
		if(!(score>=0 && score <= 100)) {
			System.out.println("0부터 100사이 점수만 입력하세요!");
		}else {
		   System.out.print("입력하신 점수 "+ score+"는(은) ");
		   score=score/10;//10으로 나눈 몫을 구함
		   
		   switch(score) {
		    case 10: case 9: System.out.print("A"); break;
		    case 8:
		    	System.out.print("B"); 
		    	break;
		    
		    case 7: System.out.print("C"); break;
		    case 6:
		    	System.out.print("D");
		    	break;
		    	
		    default: System.out.print("F");
		   }//switch ~ case
		   
		   System.out.println("학점입니다.");
		}		
	}
}
;