//익명클래스 다루기
public class Anonymous {

	//필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		
	};//익명클래스(내부무명클래스)=>Anonymous$1.class(외부클래스$번호(순번).class)
	
	void method1() {
		//지역변수값으로 대입
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
			
		};//익명클래스 => Anonymous$2.class
		
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
