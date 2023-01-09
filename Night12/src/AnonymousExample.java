//익명클래스 다루기
public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		anony.method1();

		
		anony.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("스마트 TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("스마트 TV를 끕니다.");
			}
			
		});//메서드 인자값으로 익명클래스 문법 => AnonymousExample$1.class
		
	}

}
