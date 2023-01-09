/* 정수 숫자 100을 임의의 정수숫자 난수로 나누는데 0으로 나누면 예외가 발생하는 실습 예제 
 */
public class Except08 {
	public static void main(String[] args) {

		int number = 100;
		int result = 0;
		
		for(int i = 1; i<=10; i++) {
			result = number/(int)(Math.random()*10);//0~9사이의 임의의 정수숫자 난수가 발생
			//정수숫자 100을 0으로 나누면 java.lang.ArithmeticException: / by zero 예외 
			//에러가 발생
			System.out.println(result);
		}
		
	}
	

}
