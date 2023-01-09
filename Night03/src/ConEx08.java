
public class ConEx08 {

	public static void main(String[] args) {

		/* break문 특징
		 * 반복문내에서 break문을 만나면 가장근접한 반복문을 중단한다. 
		 */
		int i;//반복문 제어변수
		for(i=1;i<=10;i++) {
			System.out.print(" "+i);
		}
		System.out.println("\n=========>");
		
		for(i=1;i<=10;i++) {
			if (i%4==0) {//4의배수일때
				break;//반복문 중단
			}
			System.out.print(" "+i);// 1 2 3
		}//for
		System.out.println();//줄바꿈
		
	}

}
