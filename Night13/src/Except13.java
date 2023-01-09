/* 예외 에러 족적과 예외 에러 메시지를 생성 
 */
public class Except13 {
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(10/0);//예외 오류 발생
			System.out.println(4);//문장실행안함
		}catch(ArithmeticException ae) {
			ae.printStackTrace();//예외 족적을 남김
			System.out.println("예외 메시지: "+ae.getMessage());
		}
		
	}

}
