
public class ConEx09 {

	public static void main(String[] args) {
		
		int a,i;// 반복문 제어 변수
		
		for(a=1; a<=5;a++) {
			for(i=1;i<=5;i++) {
				if(i%3==0) {
					break;//안쪽반복문만 중단하고 바깥반복문은 중단 못하고 계속 반복한다.
				}
				System.out.print(" i->"+i);
			}
			System.out.println("\n a->"+a);
		}
		System.out.println("\n=================>");
		exit_for://이중반복문을 모두 중단하기 위한 레이블명
		for (a=1;a<=5;a++) {
			for(i=1;i<=5;i++) {
				if(i%4==0)
					break exit_for;//이중반복문 중단
				
				System.out.print(" i->"+i);
			}//inner for
			System.out.println("\n a -> "+a);
		}//outer for
		System.out.println("\n=================>");
	}

}
