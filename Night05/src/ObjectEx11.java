class Mt11{
	void p(int a) {
		System.out.println(a);
	}
	
	void p(int a,int b) {
		System.out.println(a+"\t"+b);
	}
	
	void p(int a,int b,int c) {
		System.out.println(a+"\t"+b+"\t"+c);
	}//전달인자 개수를 다르게한 p()메서드 오버로딩
}

public class ObjectEx11 {
	public static void main(String[] args) {

		Mt11 mt=new Mt11();
		mt.p(10);
		mt.p(10,20);
		mt.p(10,20,30);
	}
}
