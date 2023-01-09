
public class ConEx07 {

	public static void main(String[] args) {
		
		int a;
		int b;
		for(a=1;a<=5;a++) {
			for(b=1;b<=5;b++) {
				System.out.print(" *");
			}
			System.out.println();// 개행=>줄바꿈
		}
		System.out.println("\n========\n");
		/*평가문제) 이중 for반복문을 사용하여 다음과 같이 출력되게 만들어보자.
		 * 출력예
		 * 		#
		 * 		##
		 * 		###
		 */
		int c;
		int d;
		for(c=1;c<=3;c++) {
			for(d=1;d<=c;d++) {
				System.out.print("#");
			}
			System.out.println();// 개행=>줄바꿈
		}
	
		
		
		
		
		
	}

}
