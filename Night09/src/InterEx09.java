/* 1. 인터페이스에서 선언된 모든 변수는 public static final로 인식되는 정적상수가된다. 
 */
interface IColor{
	int RED = 1;//public static final로인식된다.
	public static final int GREEN = 2;//정적상수, public static final은 생략가능함
	public static final int BLUE = 3;
	
	void setColor(int c);//public abstract 가 생략된 추상메서드
	public abstract int getColor();//{}가 없고, 실행문장이 없고, 호출이 불가능한 추상메서드
}

abstract class AbsColor implements IColor{
	int color = GREEN;//2가저장됨

	@Override
	public void setColor(int c) {
		color = c;
	}
}

class SubClass9 extends AbsColor{

	@Override
	public int getColor() {
		return color;
	}
}

public class InterEx09 {

	public static void main(String[] args) {

		SubClass9 sub = new SubClass9();
		sub.setColor(IColor.BLUE);//3
		System.out.println(sub.getColor());//3
	}

}
