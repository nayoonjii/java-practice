
public class Ex07_04 {

	public static void main(String[] args) {
		
		/*평가 문제) 구구단 제목은 다음과 while 반복문을 사용하여 출력한다.
		 *     2단   3단   4단  ...  ......9단
		 *     
		 *     구구단 내용은 이중 for 반복문 으로 출력한다
		 *     
		 */

		int i=2;
		while(i<10) {
			System.out.print(i+"단\t");//\t탭키만큼 수평으로 띄움
			i++;
		}
		System.out.println();
		
		for(int a=1; a<=9;a++) {
			for( i=2; i<=9;i++) {
				System.out.print(a+"x"+i+"="+(a*i)+"\t");
			}
			System.out.println();
		}
	}

}
