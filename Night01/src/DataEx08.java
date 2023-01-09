public class DataEx08 {
	public static void main(String[] args) {

		double a=89.9;
		int score=(int)a;//(int)캐스팅 형변환을 하면 소수점이하는 버리고 반올림 하지 않음. 정수값만 구함.
		
		System.out.println("score="+score);
		System.out.println("a="+a);
		
		/* 자바의 자동산술법 특징)
		 *  1.short+int로 덧셈 연산을 수행하면 자바는 자료 손실 위험이 없고, 더 효율적이고 빠른 수행을 위해서 int로 자동형변환을 해서 연산을 수행
		 *  하는 특징이 있다. 그러므로 int+int=int가 된다.
		 * 		
		 *  2. byte -> short(char) -> int -> long -> float -> double
		 *  
		 *  3.기본 타입과 참조타입간의 형변환은 할 수 없다. boolean타입과 나머지 7개의 기본타입간의 형변환도 안된다.
		 */
	}
}
