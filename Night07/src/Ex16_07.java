class Base{
	Base(){
		System.out.print("Base");
	}
}
class Alpha extends Base{
	//기본생성자가 생략된 것임. 부모의 기본 생성자르 ㄹ호출
	
}
public class Ex16_07 {

	public static void main(String[] args) {
		new Alpha();//자손의 기본생성자 호출
		new Base();//부모클래스 기본생성자 호출
	}

}
