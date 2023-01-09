class Thing02{
	private int x;
	
	public void setX(int new_x) {
		x=new_x;
	}//setter()메서드 정의
	
	public int getX() {
		return x;
	}//getter()메서드
}

public class ThingTest01 {
	public static void main(String[] args) {

		Thing02 thing;//객체주소가 저장 안된 참조변수
		thing=new Thing02();//객체주소가 저장된 참조변수(thing은 객체명,인스턴스명,실개체)
		
		//thing.x=10; //x멤버변수는 private접근권한 제어자로 선언했기 때문에 외부클래스에서 접근 못함.
		thing.setX(10);
		System.out.println(thing.getX());
	}
}
