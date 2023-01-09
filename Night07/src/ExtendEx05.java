class Parent05{//extends Object생락됨
	
	void p05() {
		System.out.println("부모클래스 메서드 p05()");
	}
}
class Child05 extends Parent05{

	@Override
	void p05() {
		super.p05();//부모클래스 메서드 호출
		System.out.println("자손에서 오버라이딩한 메서드p05()");
	}
	
	void ch05() {
		System.out.println("자손에서 추가된 메서드ch05()");
	}
	
}

public class ExtendEx05 {

	public static void main(String[] args) {
		
		Child05 ch05 = new Child05();
		ch05.p05();
		ch05.ch05();

	}

}
