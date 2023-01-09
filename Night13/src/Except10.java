//try~catch문에서 예외 오류가 발생하지 않으면 catch블록문을 실행 안한다. 즉, 프로그램 실행순서
public class Except10 {
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4);
		}catch(Exception e) {
			System.out.println(5);//이문장 실행안함
		}finally {
			System.out.println(6);//정상구문이든 예외가 발생했든 상관없이 무조건 마지막에 실행됨.
		}
	}
	//실행순서: 1->2->3->4->6

}
