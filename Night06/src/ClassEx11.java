class Car11{
	String color;//차색상
	String gearType;//변속기 종류(자동,수동)
	int door;//차 문개수
	
	Car11(){
		this("white","auto",4);//같은 클래스 내에서 오버로딩 된 전달인자 3개짜리 생성자를 호출
	}
	
	Car11(String color){
		this(color,"auto",4);
	}
	Car11(String color,String gearType,int door){	
		this.color=color;
		this.gearType=gearType;		
		this.door=door;
	}//전달인자 개수를 다르게 한 생성자 오버로딩
	
	void print() {
		System.out.println("차색상:"+this.color+",변속기종류:"+gearType+",차문개수:"+door);
		//this.생략가능함. this는 내 자신 클래스의 멤버변수 중 인스턴스변수를 가리키는 참조변수 키워드이다.
	}
}

public class ClassEx11 {
	public static void main(String[] args) {
      Car11 car=new Car11();
      car.print();
      
      Car11 car2=new Car11("RED");//오버로딩 된 생성자를 호출
      car2.print();     
      
	}
}










