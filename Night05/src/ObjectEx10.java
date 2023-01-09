class Mt10{
	int abs(int a) {//전달인자 타입을 다르게 한 메서드 오버로딩
		if(a<0) {
			a=-a;
		}
		return a;
	}
	
	double abs(double a) {
		if(a<0)
			a=-a;
		return a;
	}
	/* 메서드 오버로딩이란?
	 * 동일한 같은 클래스내에서 같은 이름의 메서드를 중복해서 여러번 정의하는 것을 말한다.
	 * 
	 * 같은 이름의 오버로딩 된 메서드 구분요건)
	 * 1.전달인자 개수를 다르게 한다.
	 * 2.전달인자 타입을 다르게 한다.
	 * 3.매개변수(전달인자) 순서를 다르게 한다.
	 */
}
public class ObjectEx10 {
	public static void main(String[] args) {

		Mt10 mt=new Mt10();
		int result=mt.abs(-100);
		System.out.println("-100의 양의 절대치 = "+result);
		
        System.out.println("-100.5 양의 절대치 = "+mt.abs(-100.5));		
	}
}





