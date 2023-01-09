//instanceof 형변환 유무 판단 연산자
class Car06{//extends Object이 묵시적으로 생략
	String color;
	int door;
	
	void drive() {
		System.out.println("차를 운전한다");
	}
	
	void stop() {
		System.out.println("차를 멈춤");
	}
}

class FireEngine06 extends Car06{
	void water() {
		System.out.println("물을 뿌린다.");
	}
}//소방차 자손 클래스


public class CastEx06 {

	public static void main(String[] args) {
		FireEngine06 fe = new FireEngine06();
		
		if(fe instanceof Car06) {//fe가 Car06타입으로 업캐스팅이 가능한가?참
			System.out.println("업캐스팅이 가능함");
			Car06 car = fe;//업캐스팅,자동현 변환
		}
		
		if(fe instanceof Object) {//fe가 최고조상Object 타입으로 업캐스팅이 가능한가? 참
			System.out.println("업캐스팅이 가능함");
			Object obj = fe;//업캐스팅
		}
	}

}
