
public class ConEx06 {

	public static void main(String[] args) {
		
		int i; // 바깥 반복문 제어변수
		int a;// 안쪽 반복문 제어변수
		
		System.out.println("i(바깥쪽 제어변수)------->  a(안쪽 반복문 제어변수)");
		for(i=1;i<=3;i++) {
			for(a=1;a<=4;a++) {
				System.out.println(i+"------->>"+a);
			}
			System.out.println("\n-----------\n"); // \n은 줄바꿈
			
			}
		//5단 구구단 구하기
		int dan;
		int j;// 반복문 제어 변수
		
		for(dan=2;dan<=9;dan++) {
			System.out.println(">>"+dan+"단<<");
			for(j=1;j<=9;j++) {
				System.out.println(dan+ " x "+j+" = "+(dan*j));
				
			}
			System.out.println("\n==========\n");
				
		}

	}

}
