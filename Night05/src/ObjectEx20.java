class Data20{
	int x;
}
public class ObjectEx20 {
	public static void main(String[] args) {

		Data20 d=new Data20();
		d.x=10;
		System.out.println("main(): d.x="+d.x);//10
		
		change(d);//객체주소가 전달
		System.out.println("change()메서드 호출후 : "+d.x);//1000=>이유는 객체주소값을 공유하기 때문이다.
	}
	
	static void change(Data20 d) {//참조 타입 매개변수
		d.x=1000;
		System.out.println("change() : x = "+d.x);
	}
}
