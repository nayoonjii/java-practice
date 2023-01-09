class Animal05{
	String name;
	private int age;//private 으로 정의된  age변수는 내 자신 클래스 내에서만 접근 가능하고,외부클래스에서 접근 못함.자바
	//보안성
	
	public void setAge(int new_age) {//setter 값 저장 메서드, setter메서드 명칭하는법:set+멤버변수명()
		//접미사로 멤버변수명을 줄때 첫글자는 관례적으로 영문대문자로 함.new_age를 매개변수명 또는 전달인자라고 부른다. 이
		//매개변수에 저장되는 값을 인자값 즉 parameter Value라고 한다.
		age=new_age;//왼쪽에 있는 age는 클래스 소속 멤버변수명이다.
	}
	
	public int getAge() {//값 반환 메서드. 즉 getter()메서드 라고 한다.
		//get+멤버변수명()
		return age;//return키워드로 메서드 호출한 곳으로 age멤버변수값을 반환
	}
}

public class ObjectEx05 {
	public static void main(String[] args) {

		Animal05 animal=new Animal05();
		animal.name="신사임당님";
		animal.setAge(29);
		
		System.out.println("이름 : "+animal.name);
		int resultAge=animal.getAge();//나이를 반환
		System.out.println("나이 : "+resultAge);
	}
}
