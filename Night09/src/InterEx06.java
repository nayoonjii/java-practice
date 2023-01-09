/* 자손클래스에서 부모 인터페이스를 상속받을 때 하나 이상의 부모로부터 다중상속을 받을수있다.
 * 
 */
interface Ihello6{
	public abstract void sayHello(String name);//추상메서드 정의.public abstract은 생략가능함
}
interface IGoodBye6{
	void sayBye(String name);//public abstract 가 생략됨
}

class SubClass6 implements Ihello6, IGoodBye6{//인터페이스 다중 상속을 받고 있다.

	@Override
	public void sayBye(String name) {
		System.out.println(name+"씨 잘가~~~~~!!!!!!");
	}

	@Override
	public void sayHello(String name) {
		System.out.println(name+"씨 안녕~");
	}
	
}

public class InterEx06 {

	public static void main(String[] args) {
		SubClass6 sub = new SubClass6();
		sub.sayHello("홍길동");
		sub.sayBye("이순신");

	}

}
