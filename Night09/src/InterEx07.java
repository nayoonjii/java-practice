/*클래스와 인터페이스를 동시 상속받는 법 형식)
 * class 자손클래스 extends부모클래스(부모추상클래스) implements 부모인터페이스(추상인터페이스){
 * 
 * }
 */

interface IHello7{
	void sayHello(String name);//public abstract이 생략됨.
}


abstract class GoodBye7{
	public abstract void bye(String name);
}

class SubClass7 extends GoodBye7 implements IHello7 {

	@Override
	public void sayHello(String name) {
		System.out.println(name+"씨 안뇽~");
	}

	@Override
	public void bye(String name) {
		System.out.println(name+"씨 잘가~~");
	}
	
}

public class InterEx07 {

	public static void main(String[] args) {
		//업캐스팅하지않고 자식클래스로 하면 한번에 가능
		SubClass7 sub = new SubClass7();
		sub.sayHello("홍길동");
		sub.bye("이순신");
		
		System.out.println("=============================");
		//부모클래스로하면 업캐스팅 다해야됨
		IHello7 ih7 = new SubClass7();
		ih7.sayHello("홍길동");
		
		GoodBye7 gb7 = new SubClass7();
		gb7.bye("이순신");

	}

}
