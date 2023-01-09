
public class Button {
	//내부인터페이스(중첩인터페이스)=> 자바 UI프로그래밍에서 이벤트 처리목적으로 많이 사용됨
	interface OnClickListener{
		void onClick();//{}가없고 , 실행문장이 없는 추상메서드 정의
	}//Button$OnClickListener.class
	
	OnClickListener listener;//참조변수 선언
	
	void SetOnClicklistener(OnClickListener listener) {//매개변수 다형성
		this.listener = listener;
	}
	void touch() {
		listener.onClick();//업캐스팅이후 오버라이딩 된 메서드 호출
	}

}
