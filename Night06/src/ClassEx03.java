class Data03{
	int x;//클래스 소속 멤버변수
}

public class ClassEx03 {
	static Data03 copy(Data03 d) {//Data03 d=d => 매개변수 d 와 main()메서드 내의 d객체는 같은 주소를 가리킨다.
		Data03 tmp=new Data03();//매개변수 d와 tmp객체주소는 다르다.
		tmp.x=d.x;//주소값은 다르고 값만 복사
		
		return tmp;
	}
	public static void main(String[] args) {

		Data03 d=new Data03();
		d.x=10;
		
		Data03 d02=copy(d);//Data03 d02=tmp;  d02와 tmp는 같은 주소이다. 결국 d와 d02는 다른 객체주소를 가지지만
		//값은 같다.
		
		System.out.println("d.x="+d.x);//10
		System.out.println("d02.x="+d02.x);//10
	}
}
