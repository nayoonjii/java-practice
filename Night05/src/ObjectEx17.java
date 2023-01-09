class Mt17{
	int year=2021;
	int month=12;
	int date=15;
}

class RefMethod{
	void changeDate(Mt17 d) {//매개변수 d타입이 클래스형인 참조타입이라서 전달되어지는 것은 값이 아니라 객체주소값이 전달
		                     //Mt17 d=m; 즉 같은 객체주소를 가짐.
		d.year=2022; d.month=6; d.date=16;
	}
}
public class ObjectEx17 {
	public static void main(String[] args) {

		RefMethod rm=new RefMethod();
		Mt17 m=new Mt17();
		System.out.println("메서드 호출전 : "+m.year+"/"+m.month+"/"+m.date);
		rm.changeDate(m);
		System.out.println("메서드 호출후 : "+m.year+"/"+m.month+"/"+m.date);
	}
}
