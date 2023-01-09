
public class Ex08_02 {

	public static void main(String[] args) {
		/*문제) 1부터100사이의 자연수 중에서 4의 배수만 제외한 누적합을 구하는 자바알고리즘코드
		 */
		int i;
		int sum=0;
		for(i=1;i<=100;i++) {
			if(i%4==0) {
				continue;
			
			}
			sum+=i;
		}
		System.out.println("1부터100까지의 자연수 중에서 4의 배수만 제외한 누적합: "+sum);

	}

}
