/* 추상클래스는 일반클래스와 마찬가지로 하나의 부모로 부터 단일 상속만 가능하다. 
 */
abstract class Hello5{//extends Object생략
	public abstract void hello(String name);//추상클래스에서 추상메서드를 정의할 때는 abstract키워드를 생략 못한다.
	//만약 생략한다면 일반메서드로 정의를 해서 {}와 몸체문장을 넣어줘야 한ㄷㅏ.
	
}

abstract class GoodBye5{
	public abstract void bye(String name);
}

class SubClass5 extends Hello5,GoodBye5{//클래스나 추상클래스나 모두 단일상속만 가능하다.
	
}
public class InterEx05 {

	public static void main(String[] args) {

	}

}
