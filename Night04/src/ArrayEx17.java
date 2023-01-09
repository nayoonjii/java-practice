import java.util.Scanner;

public class ArrayEx17 {

	public static void main(String[] args) {
		
		String[][] words = {
				{"chair","의자"},
				{"car","자동차"},
				{"computer","컴퓨터"}
		};//3행*2열 의 2차원 배열 words 생성
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<words.length;i++) {
			System.out.printf("Q%d. %s 의 뜻은?", i+1,words[i][0]);
			String answer = scan.nextLine();//문자열로 입력받음
			
			if(answer.equals(words[i][1])) {//equals()메서드는 문자열 내용이 같으면 참
				System.out.println("정답입니다.\n");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
				
			}
		}//for
		
		

	}

}
