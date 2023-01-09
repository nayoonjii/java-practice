abstract class Abs13{
	/*추상클래스 특징)
	 * 1. abstract class 키워드로 정의한다.
	 * 2. 추상클래스는 new키워드로 객체 생성을 못한다.
	 * 3. 추상클래스에는 abstract으로 정의되는 추상메서드가 올수가 있다. 추상메서드는 {}가 없고, 실생문장이 없다. 호출이 불가능하다
	 * 4. 일반클래스에는 추상메서드가 올수 가 없다
	 */
	
}
class Abs02{//일반클래스에는 추상 메서드가 못온다.
	abstract void p();// 추상메서드
}
public class AbsEx13 {

	public static void main(String[] args) {

		Abs13 abs = new Abs13();//추상클래스는 new 연산키워드로 객체 생성을 못한다.
	}

}
