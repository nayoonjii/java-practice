public class ConEx02 {
	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.printf("[%d,%d]",i,j);
				}else {
					System.out.printf("%5c", ' ');//%5c는 총 5자리 문자 표현,오른쪽 정렬이 기본
				}
			}
			System.out.println();//개행 즉 줄바꿈.
		}
	}
}
