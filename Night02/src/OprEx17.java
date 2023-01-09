public class OprEx17 {
	public static void main(String[] args) {

		/* do~while반복문 특징)
		 *  1.조건식이 참일동안만 반복한다.
		 *  2.나중에 조건을 검사하기 때문에 조건식이 거짓이라도 무조건 한번은 반복한다. 원하지 않는 값이 나올 위험이 있다.
		 *  
		 *  3.형식)
		 *   초기치;
		 *   do{
		 *   조건식이 참일동안만 반복;
		 *   증감식;
		 *   }while(조건식);
		 */
		
		int i=1;
		
		do {
			System.out.print(" "+i);
			i++;
		}while(i<=5);
		
		System.out.println("\n==========>");
		
		i=10;
		
		do {
			System.out.print(" "+i);
			i++;
		}while(i<0);
	}
}
