/* 예외가 발생해서 catch블록문을 실행하는 프로그램 실행순서 실습얘제 
 */
public class Except11 {
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(10/0);//예외발생
			System.out.println(4);//실행안함
		}catch(ArithmeticException ae) {
			System.out.println(5);
		}finally {
			System.out.println(6);
		}
		//실행순서 1->2->3->5->6
	}

}
