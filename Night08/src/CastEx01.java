class Father01{
	void f01() {
		System.out.println("부모클래스에서 정의된 메서드 f01()");
	}
}

class Son01 extends Father01{
	void s01() {
		System.out.println("자손에서 정의된 메서드 s01()");
	}
}


public class CastEx01 {

	public static void main(String[] args) {
		
		Object obj = new Son01();//업캐스팅.
		/* 참조 타입(레퍼런스) 간의 업캐스팅이란?
		 *  1. 상속관계에서 자손 클래스 타입이 부모클래스 타입으로 형변환이 되는것을 말한다. 즉, 부모타입으로 올라가는 현상이다.
		 *  	자동형변환을 해준다.
		 *  2. 참조타입간에 업캐스팅을 할려면 사전에 반드시 상속관계를 만들어야 한다.
		 */
		
		Father01 f = new Son01();//업캐스팅
		f.f01();
		
		Son01 s = new Son01();
		s.f01();//상속받아서 호출
		s.s01();//자손에서 정의된 메서드를 호출
		
		Object obj2 = s;//업캐스팅
		Father01 f2 = s;//업캐스팅
		
		f2.f01();
		
	}

}
