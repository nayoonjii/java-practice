//외부클래스 객체를 먼저 생성하고, 나중에 인스턴스 멤버 내부클래스 객체를 만든다.
public class UsingThisExample04 {
	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();//인스턴스 멤버 내부클래스 객체 생성
		inner.method();

	}
}
