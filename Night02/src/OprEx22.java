public class OprEx22 {
	public static void main(String[] args) {

		/* 평가문제)이중 for반복문을 이용해서 다음과 같은 출력물을 나오는 알고리즘 코드를 완성하자.
		 * 출력예) 
		 *    * * * * *
		 *    * * * *
		 *    * * *
		 *    * *
		 *    *
		 */
		//풀이코드 시작
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
