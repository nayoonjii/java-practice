/*컴파일에러난 이유를 주석문 처리하자. 
 */
class A{
	public final int method1() {return 0;}
}

class B extends A{
	public int method1() {return 1;} //final로 정의된 메서드는 자손클래스에서 오버라이딩을 할수없다.
}
public class Ex18_02 {

	public static void main(String[] args) {
		B b = new B();
		System.out.println("x = "+b.method1());
	}

}
