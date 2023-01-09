//기본생성자, 오버로딩 된 생성자 모두 정의 하시오.
class Animal{
	String name;
	int age;
	
	Animal(){}//기본생성자
	
	Animal(String name, int age){
		this.age = age;
		this.name = name;
	}//생성자 오버로딩
	
	public void show() {
		System.out.println(name+"는(은)"+age+"살입니다.");
	}//사용자 정의 메서드
}
public class Ex13_01 {

	public static void main(String[] args) {

		Animal a1 = new Animal("원숭이",26);//오버로딩된 생성자를 호출
		a1.show();
	}

}
