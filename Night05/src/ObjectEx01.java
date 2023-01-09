public class ObjectEx01 {
	static void sum(int count) {//count는 매개변수 즉 전달인자,void형은 리턴타입이 없다.즉 반환값이 없다.
		int i;//반복문 제어변수
		int total = 0;//누적합
		/* 지역변수는 선언과 동시에 초기화를 하고 사용해야 한다. 
		 */
		
		for(i=1;i<=count;i++) {
			total+=i;
		}
		
		System.out.printf("%d부터 %d 까지의 누적합=%d%n",1,count,total);
	}//sum()메서드 정의
	
	public static void main(String[] args) {
        sum(5);//5는 매개변수에 저장되는 인자값
        sum(10);
	}
}
