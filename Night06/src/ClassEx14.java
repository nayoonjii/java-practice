class St14{
	static int a = 100;
	int b = 200;
	
	static void printA() {
		System.out.println(this.b);//정적메서드 내에서 this를 사용 못함.
	}
	
	static void printB() {
		System.out.println(b);//정적메서드 내에서 인스턴스 변수를 사용 못함.
	}
	
}
public class ClassEx14 {

	public static void main(String[] args) {

	}

}
