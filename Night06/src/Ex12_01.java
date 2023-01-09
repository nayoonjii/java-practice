class Meth03{
	void p(int a,int b) {
		if(a>b) {
			System.out.println(a+"와 "+b+"중 더 큰수 : "+a);
		}
	}
	
	void p(double a,double b) {
		if(a<b) {
			System.out.println(a+"와 "+b+"중 더 큰 실수값 : "+b);
		}
	}//매개변수 타입을 다르게 한 메서드 오버로딩
}
public class Ex12_01 {
	public static void main(String[] args) {
/*추가문제)별도의  Meth03클래스를 정의하고 p()메서드를 오버로딩을 하세요.그리고 최대값을 구할때는 if~else문을 사용하세요.  
 */
		//풀이코드 시작
		Meth03 me=new Meth03();
		me.p(100,50);
		me.p(50.0,103.0);
	}
}
