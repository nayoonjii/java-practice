
public class ConEx10 {

	public static void main(String[] args) {
		
		int i;
		for(i=1;i<=10;i++) {
			if(i%4==0) {
				continue;//아래문장 실행하지 않고 반복문 처음으로 돌아가서 다음 반복을 계속한다.
			}
			System.out.print(" "+ i);
		}
		System.out.println();//개행=>줄바꿈
	}

}
