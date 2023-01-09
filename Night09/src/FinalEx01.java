/*1. final로 선언된 변수는 상수가 된다.상수명은 관례적으로 영문대문자로 정의 한다.
 *2. 상수명은 선언과 동시에 초기화를 해야한다. 값도 수정 못한다. 
 */
class FinalMember{
	final int ABC = 100;//ABC는 상수명이 된다.
	
	public void setA(int a) {
		ABC = a;//상수는 수정못함
	}
}

public class FinalEx01 {

	public static void main(String[] args) {
		

	}

}
