/*1. 메서드를 final예약어로 선언하면 마지막 메서드가 되어서 자손에서 오버라이딩을 허용하지않는다. 
 */
class FinalMethod{//extends Object생략
	String str = "Java";
	
	public final void setStr(String str) {
		this.str = str;
	}
}

class FinalClass extends FinalMethod{
	@Override
	public void setStr(String str) {
		//final 메서드는 오버라이딩 할 수 없다.
	}
}
public class FinalEx02 {

	public static void main(String[] args) {

	}

}
