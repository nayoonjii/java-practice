
public class ConEx05 {

	public static void main(String[] args) {

		int i;	// 반복문 제어변수
		int odd_tot, even_tot;
		
		for(i=1,odd_tot = 0;i<=9;i=i+2) {
			odd_tot = odd_tot+i;	//홀수들의 누적합
		}
		System.out.println("홀수들의 누적합 = "+odd_tot);
		
		for(i=2, even_tot=0;i<=10;i+=2) {
			even_tot += i;//짝수들의 누적합
			
		}
		System.out.println("짝수들의 누적합 = "+even_tot);
		
		//for 반복문 안에 if else분기문으로 홀수 짝수들의 누적합
		for(i=1,odd_tot = 0, even_tot =0;i<=10;i++) {
			if(i%2==1) {//홀수일때 실행
				odd_tot+=i;
			}else {//나머지가 0일떼 즉 짝수일때 실행
				even_tot+=i;
			}//if else
		}//for
		
		System.out.println("짝수들의 누적합 = "+even_tot);
		System.out.println("홀수들의 누적합 = "+ odd_tot);
		
	}

}
