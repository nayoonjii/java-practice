/* catch블록문에서 instanceof 즉 형변환 유무 판단연산자 활용 실습 예제 
 */
public class Except12 {
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(7/0);//예외발생
			System.out.println(4);//이문장 실행 안함
		}catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {//형변환이 가능하면 참
				System.out.println("true");
			}//if
			System.out.println("ArithmeticException");
		}catch(Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println(5);
		}
		
	}

}
