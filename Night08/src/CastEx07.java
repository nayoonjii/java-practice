/* 부모와 자손에서 동일 멤버변수와 메서드가 오버라이딩 된 경우 변수, 메서드 호출문제
 */
class Parent07{
	int x = 100;
	
	void method() {
		System.out.println("Parent07 method()");
	}
}

class Child07 extends Parent07{
	int x = 200;

	@Override
	void method() {
		System.out.println("오버라이딩 한 메서드");
	}
	
}
public class CastEx07 {

	public static void main(String[] args) {
		Parent07 p = new Child07();//업캐스팅
		System.out.println("p.x = "+p.x);//부모클래스와 자손클래스에서 동일 멤버변수가 정의된 경우는 참조변수(왼쪽) 타입에의해서
		//호출되는 변수가 결정됨
		p.method();//메서드가 오버라이딩이 된 경우는 참조변수 p가 실제 가리키는 인스턴스 즉 객체타입에 의해서 호출되는 
		//메서드가 결정됨
		
		Parent07 p2 = new Parent07();
		System.out.println("p.x = "+p2.x);//부모의 x변수 호출
		p2.method();
		
		Child07 c = new Child07();
		System.out.println("c.x = "+c.x);//자손의 x변수 호출
		c.method();
	}

}
