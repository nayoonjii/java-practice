public class OprEx16 {
	public static void main(String[] args) {

		int i;
		i=1;
		
		while(i<=9) {
			System.out.print(" "+ i);
			i+=2;
		}
		System.out.println("\n========>");
		
		i=10;
		
		while(i>=2) {
			System.out.print(" "+i);
			i=i-2;
		}
		System.out.println("\n=========>");
		
		/* 문제) while반복문을 활용하여 1부터 10까지의 자연수에서 짝수들의 누적합을 구해 보자. 
		 */
		//풀이 코드 시작
		
		i=1;
		int sum=0;
		
		while(i<=10) {
		   if(i%2==0) {//2의 배수일때
			   sum+=i;
		   }
		   i++;//i+=1, i=i+1
		}
		System.out.println("누적합="+sum);
		
		i=2; sum=0;
		while(i<=10) {
			sum=sum+i;
			i=i+2;//2씩증가
		}
        System.out.println("누적합="+sum);		
        
        i=10; sum=0;
        while(i>=2) {
        	if(i%2==0) {
        		sum+=i;
        	}
        	i--;
        }
        System.out.println("누적합="+sum);
	}
}






