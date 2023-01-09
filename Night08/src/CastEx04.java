//instanceof 형변환 유무 판단연산자와 if조건문을 함께활용해서 업다운 시켜보자.
class HandPhone04{
	String model;//모델명
	String number;
	
	public HandPhone04() {
		//기본생성자
	}
	
	public HandPhone04(String model, String number) {
		this.model = model;
		this.number = number;
	}//생성자 오버로딩
}//부모클래스

class DicaPhone04 extends HandPhone04{
	String pixel;
	
	public DicaPhone04() {}
	
	public DicaPhone04(String model, String number, String pixel) {
		super(model, number);//조상클래스 오버로딩 된 생성자 호출
		this.pixel = pixel;
	}
	
	public void prn() {
		System.out.println("폰모델: "+model+", 폰번호: "+number+", 화소수:"+pixel);
	}
}

public class CastEx04 {

	public static void main(String[] args) {
		DicaPhone04 dp = new DicaPhone04("갤럭시","010-9999-9999","1024");
		dp.prn();
		System.out.println("===================>");
		
		if(dp instanceof HandPhone04) {//instanceof 는 형변환 유무 판단 연산자,dp가 업캐스팅이 가능한가?참
			System.out.println("dp는 업캐스팅이 가능하다.");
			HandPhone04 hp = dp;//업캐스팅
		}else {
			System.out.println("업캐스팅이 불가능함");
		}
		
		HandPhone04 hp = new HandPhone04();//사전에 업캐스팅을 하지 않아서 다운캐스팅이 안됨
		if(hp instanceof DicaPhone04) {//hp는 다운캐스팅이 가능한가? 거짓
			System.out.println("hp는 다운캐스팅이 가능함");
			DicaPhone04 dp2=(DicaPhone04)hp;
		}else {
			System.out.println("다운캐스팅이 불가능함");
		}
		
	}

}
