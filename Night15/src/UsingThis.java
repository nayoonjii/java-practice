//인스턴스 멤버 내부 클래스의 메서드에서 람다식을 활용한 실습
public class UsingThis {
	private int outterField = 10;
	
	class Inner{
		int innerField = 20;
		
		void method() {
			//람다식
			MyFunctionalinterface04 fi = () -> {
				System.out.println("outterField : "+outterField);//인스턴스 멤버내부
				//클래스에서 외부클래스에  private으로 정의된 멤버변수 접근 가능하다.
				System.out.println("outterField : "+ UsingThis.this.outterField);
				System.out.println("\n================>");
				
				System.out.println("innerField : "+ innerField);
				System.out.println("this.innerField : "+this.innerField);
			};
			
			fi.method();
		}//method
	}//UsingThis$Inner.class
}
