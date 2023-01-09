/*추가적으로 이클립스 메뉴로 메서드 오버라이딩을 해주세요
 */
class A2{//extends Object
	//public String toString() {return"4";}
	
	@Override
	public String toString() {//Object 클래스의 toString() 메서드를 오버라이딩
		return "4";
	}
	
}

class B2 extends A2{

	@Override
	public String toString() {
		return super.toString()+"3";
	}
	

}
public class SubEx09 {

	public static void main(String[] args) {
		System.out.println(new B2());//.toString() 메서드가 생략됨
		System.out.println(new B2().toString());
		
		B2 b = new B2();
		System.out.println(b.toString());
		System.out.println(b);//.toString()메서드가 생략됨
	}

}
