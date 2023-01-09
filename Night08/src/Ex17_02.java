//사용되어진 자바문법:클래스 상속과 오버라이딩, 업캐스팅, 업캐스팅이후 오버라이딩 된 메서드 호출
class Super{//extends Object생략
	public int getNumber(int a) {
		return a + 1;
	}//
}

class CastingEx03 extends Super{

	@Override
	public int getNumber(int a) {
		return a+2;
	}
	
}
public class Ex17_02 {
	public static void main(String[] args) {
/*추가문제) 대표적으로 사용 되어진 자바문법을 주석문 처리하시고, 이클립스 메뉴로 사용되어진 문법을 추가해보세요
 */

		Super su = new CastingEx03();//업캐스팅
		System.out.println(su.getNumber(0));//업캐스팅 이후 오버라이딩 된 메서드 호출 ->참조변수가 실제 가리키는
		// 객체 타입에 의해서 호출되는 메서드가 결정됨
		
	}

}
