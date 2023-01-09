class Mt12{
	void prn(int a) {//메서드명 앞의 리턴타입 자료형을 다르게 한 메서드 오버로딩은 허용하지 않는다. 기준은 매개변수 타입이
		//달라야 한다. 즉 매개변수 기준이다.
		System.out.println(a);
	}
	
	int prn(int a) {
		return a;
	}
}

public class ObjectEx12 {
	public static void main(String[] args) {

		Mt12 m=new Mt12();
		m.prn(100);
	}
}
