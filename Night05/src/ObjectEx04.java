class Animal04{
  String name;
  int age;//클래스 소속 멤버변수명(속성)
}//Animal04 class

class Thing{
	int x;
}

public class ObjectEx04 {
	public static void main(String[] args) {

		Animal04 am;//객체주소가 저장 안된 참조변수 am(레퍼런스 변수)
		am=new Animal04();//객체주소가 저장된 참조변수. 곧 객체명,인스턴스명,실개체=>am
		
		am.name="홍길동";//객체명.멤버변수명으로 접근
		am.age=26;
		
		System.out.println("이름 : "+am.name);
		System.out.println("나이 : "+am.age);
		System.out.println("\n=========\n");
		
		Animal04 b=new Animal04();//b객체 생성
  	    b.name="펭귄";
	    b.age=12;
	    
	    System.out.println(b.name+","+b.age);
	    
	    System.out.println("====================>");
	    
        Thing thing=new Thing();
        thing.x=10;
        
        System.out.println("thing.x="+thing.x);
	}
}






