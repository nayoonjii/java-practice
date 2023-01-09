public class OprEx18 {
	public static void main(String[] args) {

		int odd_sum=0;//홀수 누적합
		int even_sum=0;//짝수 누적합
		int i=1;//반복문 제어변수
		
		do{
			if(i%2==0) {//짝수일때 실행
              even_sum += i;
			}else {
			  odd_sum += i; 	
			}
			i++;
		}while(i<=10);
		
		System.out.println("짝수들의 누적합="+even_sum);
		System.out.println("홀수들의 누적합="+odd_sum);
		
		i=10;
		do {
			System.out.print(" "+i);
			i-=2;
		}while(i>=0);
	}
}
