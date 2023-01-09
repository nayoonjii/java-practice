class SubClass extends Object{
	int i = 3;
}
public class Ex17_01 {
	public static void main(String[] args) {
/*추가문제) 형변환 유무 판단연산자, if조건문 등을 활용해서 다운캐스팅을 하는 부분을 수정해보자
 */
	
		Object o = new SubClass();//업캐스팅
		
		if (o instanceof SubClass) {//다운캐스팅이 가능하면 참
			System.out.println("다운캐스팅이 가능함");
			SubClass foo = (SubClass)o;//명시적인 다운캐스팅
			System.out.println("i = "+ foo.i);
		}
	}

}
