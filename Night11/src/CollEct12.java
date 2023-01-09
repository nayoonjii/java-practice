//제네릭 <T>타입 클래스
class GenericClass<T>{
	private T member;

	public T getMember() {
		return member;
	}//getter()메서드 정의

	public void setMember(T member) {
		this.member = member;
	}//setter()메서드 정의
	
	
}
public class CollEct12 {
	public static void main(String[] args) {

		GenericClass<Double> obj01 = new GenericClass<Double>();//실수값만 저장가능
		obj01.setMember(99.9);
		System.out.println("반환되는 실수값 = "+obj01.getMember());
		
		GenericClass<Integer> obj02 = new GenericClass<Integer>();//정수값만 저장가능
		obj02.setMember(98);
		System.out.println("반환되는 정수값 = "+obj02.getMember());
		
		GenericClass<String> obj03 = new GenericClass<>();
		obj03.setMember("서울시");//문자열만 저장가능
		System.out.println("반환되는 문자열 = "+obj03.getMember());
		
	}

}
