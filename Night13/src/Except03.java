/* finally 문 특징)
 *	 try~catch문에서 정상구문이 실행되거나 애외 오류가 발생하거나에 상관없이 무조건 마지막에 수행되어야 할 
 *	  문장을 넣을때 주로 사용한다. 
 */
public class Except03 {
	public static void main(String[] args) {

		int a = 10;
		int b01 = 5;
		int b02 = 0;
		int result = 0;
		
		try {
			result = a/b01;
			System.out.println("result = "+result);
			
			result = a/b02;// 예외에러발생
			System.out.println("result = "+result);
		}catch(ArithmeticException ae) {
			System.out.println("예외 에러: "+ae);
		}catch(Exception e) {
			System.out.println("예외 에러2:"+e);
		}finally {
			System.out.println("예외와 상관없이 무조건 마지막에 실행");
		}
		
	}

}
