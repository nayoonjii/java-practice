/* interface 자손인터페이스 extends 부모인터페이스, 부모인터페이스{}
 * 인터페이스간의 상속은 extends 를 사용하고, 다중상속이가능하다. 
 */
interface Hello8{
	void sayHello8(String name);
}

interface IGoodBye8{
	public abstract void sayBye(String name);
}

interface ITotal extends Hello8,IGoodBye8{
	void greeting(String name);//추상메스드 정의
}

class SubClass8 implements ITotal{

	@Override
	public void sayHello8(String name) {
		System.out.println(name+"씨 안녕 >3<");
	}

	@Override
	public void sayBye(String name) {
		System.out.println(name+"씨 잘가ㅏㅏ ㅠㅅㅠ");
	}

	@Override
	public void greeting(String name) {
		System.out.println(name+"씨 반가워용 ^0^");
	}
	
}
public class InterEx08 {

	public static void main(String[] args) {

		SubClass8 sub = new SubClass8();
		sub.sayHello8("홍길동");
		sub.greeting("강감찬");
		sub.sayBye("이순신");
			}

}
