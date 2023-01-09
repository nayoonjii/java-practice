/* 1.추상메서드를 자손에서 강제 오버라이딩을 해야한다. 
 */
abstract class Abs1{
	int a = 10;
	private String str = "Test";
	
	public abstract void printA();//추상메서드는 {}가없고, 실행문장이 없고, 호출이 불가능하다.
	public String getStr() {
		return str;
	}
}

abstract class Abs2 extends Abs1{
	int b= 100;
	public abstract int getB();
}

class AbsMain extends Abs2{

	@Override
	public int getB() {
		return b;
	}

	@Override
	public void printA() {
		System.out.println("a = "+a);//상속받아서 사용
	}
	
	
}
public class Ex18_01 {
	public static void main(String[] args) {

		AbsMain am = new AbsMain();
		am.printA();
		System.out.println(am.getB());
	}

}
