interface I11{
	public abstract void play();//추상메서드 정의
}

class B11 implements I11{

	@Override
	public void play() {
		System.out.println("play in B11 class");
	}
}//첫번째 자손클래스

class C11 implements I11{

	@Override
	public void play() {
		System.out.println("play in C11 class");
	}
}//두번째 자손클래스

class A11{//A11은 I11 인터페이스를 통해서 간접연결되고 보다 더 유연하게 연결된다.
	void autoPlay(I11 i) {//매개변수 다형성 = 업캐스팅 + 상속 : 코드라인을 줄인다. I11 i = new B11();
		//부모매개변수 타입으로 모든 자손을 받을수있다.
		i.play();//업캐스팅 이후 오버라이딩 한 메서드 호출
		
	}
}
public class InterEx11 {

	public static void main(String[] args) {

		A11 a = new A11();
		a.autoPlay(new B11());
		a.autoPlay(new C11());
	}

}
