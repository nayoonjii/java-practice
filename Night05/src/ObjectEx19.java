class Data{
	int x;//클래스 소속 멤버변수
}
public class ObjectEx19 {
	static void change(int a) {//매개변수 a타입이 기본타입 =>기본형 매개변수
		a=1000;
		System.out.println("change() : a = "+a);
	}
	public static void main(String[] args) {

		Data d=new Data();
		d.x=10;
		System.out.println("main() : d.x ="+d.x);//10
		
		change(d.x);//값만 전달
		System.out.println("change()메서드 호출후: d.x ="+d.x);
	}
}
