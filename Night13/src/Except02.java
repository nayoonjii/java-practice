/* 복수개의 catch블록을 사용할 경우는 예외처리 자손을 먼저 기술하고 부모는 나중에 기술한다. 
 */
public class Except02 {
	public static void main(String[] args) {

		int a = 10,b01 = 2, b02 = 0, re = 0;
		
		try {
			re = a/b01;
			System.out.println(re);
			
			re = a/b02;//정수숫자를 0으로 나누면 예외발생. 아래문장을 수행안함
			System.out.println(re);
		}catch(ArithmeticException ae){
			System.out.println("예외 에러 메시지: "+ae);		
		}catch(Exception e) {
			System.out.println("예외에러메시지2 : "+e);
		}
	}
}
 