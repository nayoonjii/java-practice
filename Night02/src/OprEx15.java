public class OprEx15 {
	public static void main(String[] args) {

		int i;//반복문 제어변수
		int sum=0;//누적합
		
		for(i=1;i<=10;i++) {
			sum += i;
		}
		
		System.out.println("누적합 = "+sum);
		
		/* while 반복문 형식)
		 *  초기치;
		 *  while(조건식){
		 *  조건식이 참일동안만 반복실행;
		 *  증감식;
		 *  }
		 */
		i=1;
		while(i<=3) {
			System.out.println(i+"번 while반복문 실행");
			i=i+1;//i+=1
		}
	}
}
