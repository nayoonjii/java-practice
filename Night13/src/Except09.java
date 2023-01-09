//정수숫자 100을 임의의 정수숫자 난수중 0으로 나누어서 예외가 발생했을때 catch블록문을 실행해서 0으로 
//출력되게 하는 예제
public class Except09 {
	public static void main(String[] args) {

		int number = 100;
		int result = 0;
		
		for(int i = 0; i<10; i++) {
			try {
				result = number / (int)(Math.random()*10);
				System.out.println(result);
			}catch(ArithmeticException ae) {
				System.out.println("0");
			}
		}//for
		
	}

}
