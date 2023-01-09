import java.util.Scanner;

public class OprEx10 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		char grade=' ';//학점
		char opt='0';
		
		System.out.print("0~100사이 점수 입력>>");
		int score=Integer.parseInt(scan.nextLine());
		
		if(!(score>=0 && score <= 100)) {
			System.out.println("0부터 100사이 점수를 입력하세요!");
		}else {
			System.out.print("입력하신 점수 "+score+"는(은) ");
			
			if(score>=90) {//90~100
				grade='A';
				
				if(score>=98) {//98~100
					opt='+';
				}else if(score<94) {//90~93
					opt='-';
				}//나머지는 0
			}else if(score>=80) {//80~89
			    grade='B';
			    
			    if(score >= 88) {//88~89
			    	opt='+';
			    }else if(score<84) {
			    	opt='-';
			    }//84~87 B0
			}else if(score<=59) {
				grade='F'; //opt=' ';
			}
			/* 문제)88~89점은 B+, 84~87점은 B0, 80~83점은  B- 학점이 나오게 코드를 작성하고, 0~59점은 F학점만 출력되게 만들어
			 * 보자.
			 */
			
			if(grade == 'F') {
				System.out.println(grade+"학점입니다.");
			}else {
			    System.out.printf("%c%c학점입니다.", grade,opt);
			}
		}//if else
	}
}







