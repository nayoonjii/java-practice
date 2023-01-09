class TestSuper{
	
	TestSuper(){}//기본생성자를 명시적 코드
	
	TestSuper(int i){
		
	}
}

class TestSub extends TestSuper{
	/*에러가 나는 이유는? 부모클래스 생성자가 오버로딩이 되면 자바는 더이상 매개변수가 없는 기본생성자를 묵시적으로 제공하지 않는다.
	 * 
	 */
	/*TestSub(){
		super(10);//자손에서 부모의 오버로딩 된 생성자를 호출
	}*/
}

public class Ex16_06 {

	public static void main(String[] args) {
		new TestSub();
	}

}
