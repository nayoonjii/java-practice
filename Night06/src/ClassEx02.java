class Meth02{
	void p(int a,long b) {
		System.out.println(a+","+b);
	}
	
	void p(long b,int a) {//전달인자(매개변수) 순서를 다르게 한 메서드 오버로딩
		System.out.println(b+","+a);
	}
}
public class ClassEx02 {
	public static void main(String[] args) {

		Meth02 mt=new Meth02();
		mt.p(10,20L);
		mt.p(20L,10);		
	}
}
