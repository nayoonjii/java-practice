class St13{
	static int a = 10;
	
	static int getA() {//static으로 정의된 메서드를 정적(클래스) 메서드 라고 한다. 해당 클래스로 직접 접근가능하다.
		return a;
	}
	void setA(int new_a) {//static예약어가 없는 인스턴스 메서드
		a = new_a;
	}
}
public class ClassEx13 {

	public static void main(String[] args) {

		St13 s01 = new St13();
		s01.setA(1000);//인스턴스 메서드 호출
		System.out.println(St13.getA());//클래스명.정적메서드
		
		
	}

}
