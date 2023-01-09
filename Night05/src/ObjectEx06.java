class Tv06{
	int channel;//채널번호, int타입의 멤버변수는 기본값 0으로 초기화
	
	void channelUp() {
		++channel;//선행 증가
	}
	
	void channelDown() {
		--channel;//채널감소
	}
}

public class ObjectEx06 {
	public static void main(String[] args) {

		Tv06 t01=new Tv06();
		Tv06 t02=new Tv06();//t01,t02는 서로 다른 객체주소를 가진다.
		
		System.out.println("t01.channel :"+t01.channel+",t02.channel :"+t02.channel);
		
		t01.channel=10;
		t01.channelDown();//채널 감소=>9
		
		System.out.println("t01.channel : "+t01.channel+",t02.channel : "+t02.channel);
	}
}
