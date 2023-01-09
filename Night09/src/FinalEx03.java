/* 1. 클래스를 final 로 선언하면 마지막 클래스가 되어서 상속을 허락하지 않는다. 즉 자손클래스를 못 만든다.
 */
final class FinalClass03{
	
}

class FinalChild03 extends FinalClass03{//final class는 자손 클래스를 못만든다.
	
}
public class FinalEx03 {

	public static void main(String[] args) {

	}

}
