/* throw, throws 키워드에 대해서 학습 
 */
public class Except06 {
	public static void exp(int a) throws NullPointerException{
		if(a == 0) {
			throw new NullPointerException();//throw에 의해서 인위적 예외발생
		}
	}
	public static void main(String[] args) {
		try {
			System.out.println("예외 발생하는 메서드 호출전");
			exp(0);//같은 클래스내에서 정적메서드를 호출할 때는 해당 클래스명을 생략해도된다.
			System.out.println("예외 발생하는 메서드 호출후");
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
}
