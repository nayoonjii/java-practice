/* 예외처리법 )
 * try{
 *  정상구문;
 *  정상구문이 실행되다가 예외 에러가 발생하면 아래문장은 실행하지 않고, 프로그램 제어순서가 해당 catch블록으로
 *  이동해서 예외를 처리한다.
 *  }catch(예외처리 클래스 매개변수){
 *   예외를 처리한다.
 *  }  
 */
public class Except01 {
	public static void main(String[] args) {
		int a = 10, b01 = 0, b02 = 2, result = 10;
		
		try {
			result = a/b02;
			System.out.println(result);
			
			result = a/b01;//정수 숫자를 0으로 나누면 예외 에러가(ArithmeticException) 발생 하고
			//아래문장 수행안함. 실행순서가 해당 catch{}블록으로 옮겨진다.
			System.out.println(result);//이문장 수행 안함
		}catch(Exception e) {
			e.printStackTrace();//예외족적을 남김
		}	
	}
}
