/* java8 에서 추가된 함수형 인터페이스 특징)
 * 1. @FunctionalInterface로 정의한다.(람다식을 활용하기 위한 인터페이스)
 * 2. 함수형 인터페이스는 람다식을 위한 인터페이스이고 추상메서드가 딱 하나만 올수있다.
 */
@FunctionalInterface
public interface MyFunctionalinterface {
	
	public void method();//abstract이 생략된 추상 메서드. 추상메서드는 {}가없고, 실행문장이 없고,
	//호출이 불가능
	

}
