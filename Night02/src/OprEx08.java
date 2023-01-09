public class OprEx08 {
	public static void main(String[] args) {

		String naraName ="Korea";
		char ch=naraName.charAt(0);//첫문자를 0부터 카운터하고,첫 단일문자를 구함
		
		switch(ch) {
		  case 'A': case 'a':
			  System.out.println("미국"); break;
			  
		  case 'J': case 'j':
			  System.out.println("일본"); break;
			  
		  case 'K': 
		  case 'k': System.out.println("대한민국"); break;
		  
		  default: System.out.println("해당하는 나라가 없습니다.");
		}
	}
}
