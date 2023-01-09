class Tv07{
	int channel;
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

public class ObjectEx07 {
	public static void main(String[] args) {

		Tv07 tv01=new Tv07();
		Tv07 tv02=new Tv07();//tv01과 tv02는 서로 다른 객체주소를 가진다.
		
		System.out.println("tv01.channel="+tv01.channel+",tv02.channel ="+tv02.channel);//0,0
		
		tv02=tv01;//tv01객체주소가 tv02에 대입된다. 결국, tv01과 tv02는 같은 주소를 가리킨다.
		tv02.channel=10;
		tv01.channelUp(); tv01.channelUp();//12
		
		System.out.println("tv01.channel="+tv01.channel+",tv02.channel ="+tv02.channel);	
		//같은 주소값을 가져서 값도 공유한다. 12,12
	}
}
