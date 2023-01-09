interface I12{
	public abstract void methodB();//추상메서드 정의 => {}가없고, 실행문장이 없고, 호출이 불가능
}

class B12 implements I12{

	@Override
	public void methodB() {
		System.out.println("methodB in B12 class");
	}

	@Override
	public String toString() {
		return "B12 class";
	}
}//B12 class

class InstanceManager{
	public static I12 getInstance() {
		return new B12();
	}
}
class A12{
	void methodA() {
		I12 i = InstanceManager.getInstance();//부모타입으로 업캐스팅
		i.methodB();//업캐스팅이후 오버라이딩 한 메서드 호출
		System.out.println(i.toString());//.toString()은 생략가능
	}
}//A12 class
public class InterEx12 {
	public static void main(String[] args) {
		A12 a = new A12();
		a.methodA();
		
	}

}
