public class OprEx13 {
	public static void main(String[] args) {
/* for 반복문 형식)
 * for(초기치;조건식;증감식){
 *   조건식이 참일 동안만 반복;
 * } 
 */

		int i;//반복문 제어변수
		for(i=1;i<=5;i++) {
			System.out.print(" " + i);
		}
		System.out.println("\n------------>");
		
		for(i=5;i>=1;i--) {
			System.out.print(" " +  i);
		}
		
		System.out.println("\n---------------->");
		
		for(i=2;i<=10;i+=2) {
			System.out.print(" " + i);
		}
		
		System.out.println("\n ----------------->");
		
		for(i=9;i>=1;i=i-2) {
			System.out.print(" "+ i);
		}
	}
}
