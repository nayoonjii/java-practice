public class ObjectEx03 {
	public static void main(String[] args) {
/* 
 *  문제) static void guDan(int dan){}메서드를 정의하고 해당 메서드를 호출할때 9 인자값을 전달해서 9단을 for반복문으로
 *  출력하는 메서드를 만들어 본다.
 */
		//풀이 코드 시작
		guDan(9);
		guDan(7);
	}//main()
	
	static void guDan(int dan) {
		System.out.println(">>"+dan+"단<<");
		System.out.println("==========>");
		
		for(int j=1;j<=9;j++) {
			System.out.println(dan+ "* "+j+" = "+(dan*j));
		}
		System.out.println("=========");
	}//guDan()
}
