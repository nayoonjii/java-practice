class Animal{
	protected String kind;
	protected int leg;
	
	public Animal() {}
	
	public Animal(String kind, int leg) {
		this.kind = kind;
		this.leg = leg;
	
	}//생성자 오버로딩
	
	public String getKind() {
		if (kind.equals("소녀")) {//String 문자열 값 내용이 같다, 다르다는 equals()메서드를 사용한다.
			System.out.println(kind+"는 사람이다.");
		}else {
			System.out.println(kind+"는 동물이다.");
		}		
		return kind;	
	}
	
	public void walk() {
		if (leg == 2) {
			System.out.println("사람은"+leg+"발로 걷는다");
		}else {
			System.out.println("강아지는"+leg+"발로 걷는다.");
		}
	}

}
 
	
class Dog extends Animal{
	public Dog() {}
	public Dog(String kind, int leg) {
		super(kind,leg);//부모클래스 오버로딩 된 생성자를 호출
	}
}

class Human extends Animal{
	public Human() {}
	public Human(String kind, int leg) {
		super(kind, leg);
	}

}

public class Ex16_04 {

	public static void main(String[] args) {
		
		Dog d = new Dog("강아지",4);
		Human h = new Human("소녀",2);
		
		d.getKind();
		d.walk();
		h.getKind();
		h.walk();
	}

}
