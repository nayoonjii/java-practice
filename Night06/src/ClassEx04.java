class MyDate04{
	private int year;
	private int month;
	private int date;
	
	/* 클래스 멤버변수 초기값 종류)
	 * 1.int 타입은 0
	 * 2.double타입은 0.0
	 * 3.boolean 타입은   false
	 * 4.참조 타입은 null이다.
	 * 
	 * 멤버변수는 코드를 통한 초기화를 하지 않아도 기본값이 저장된다.
	 */
	
	public MyDate04() {
		System.out.println("MyDate04 class 생성자");
	} /* 생성자 특징)
	     1.생성자 명은 클래스명과 같다. new 클래스명();에 의해서 생성자 호출
	     2.매개변수가 없는 생성자를 기본생성자라고 한다.생성자가 오버로딩이 안된 경우는 자바 컴파일러가 기본생성자를 묵시적으로
	     제공한다. 하지만 오버로딩 된 경우는 기본생성자를 묵시적 제공하지 않는다.
	 */
    	
	public void print() {
		System.out.println(year+"/"+month+"/"+date);
	}
}
public class ClassEx04 {
	public static void main(String[] args) {
       MyDate04 md=new MyDate04();//md객체 생성
       md.print();
	}
}





