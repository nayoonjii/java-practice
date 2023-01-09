public class DataEx20 {
	public static void main(String[] args) {

		byte a=10;
		byte b=20;
		int result=a+b;//int+int=int
		
		System.out.println(result);	
		
		int c=1000000;
		int d=2000000;
		long e=c*d;
		/* c*d=>int*int=int로 나오는대 결과값 숫자 범위가 int타입 범위를 벗어나서 잘못된 값이 저장된다. 그러므로 long*int로 하면 결과값은
		 * long타입값이 되어서 값의 범위를 벗어나지 않는다. 자동산술법=>long*int=>long*long=long
		 */
		e=(long)c*d;
		
		System.out.println(e);		
		/* 문제)곱셈 결과값이 값 손실이 발생해서 엉뚱한 값이 저장되어서 출력된다. 소스를 수정해 보자. 
		 */
	}
}
