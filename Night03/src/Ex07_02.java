
public class Ex07_02 {

	public static void main(String[] args) {
		int i;
		int sum;
		
		for(i=1, sum=0; i<=100; i++) {
			sum+=i;
			
			if(i % 10 == 0) {//10의 배수 일때 실행
				System.out.println("1~"+i+"까지의 합="+sum);
			}
		}

	}

}
