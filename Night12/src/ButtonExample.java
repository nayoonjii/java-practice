
public class ButtonExample {
	public static void main(String[] args) {
		
		Button btn = new Button();
		
		btn.SetOnClicklistener(new CallListener());//업캐스팅 되면서 매개변수 다형성
		btn.touch();
		
		btn.SetOnClicklistener(new MessageListener());
		btn.touch();
		
	}

}
