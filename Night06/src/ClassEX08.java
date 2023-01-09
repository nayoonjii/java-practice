class MyDate08{
	int year;
	int month;
	int date;
	
	MyDate08(){}
	
	MyDate08(int year,int month,int date){
		year=year;/*
		왼쪽의 클래스 소속 멤버변수명과 오른쪽의 생성자 소속의 매개변수명(전달인자)이 같은 경우는 어느 것이 멤버변수명이고 매개변수
		  명인지 자바는 구분을 못해서 값을 저장 못함.
		*/		
		this.month=month;//왼쪽의 속성(멤버변수명)명 앞에 this.을 붙이면 해당 속성이 클래스 소속이 되어서 구분이 되어져서 
		//값을 저장 할 수 있다.
		this.date=date;
	}
	
	void print() {
		System.out.println(year+"년 "+month+"월 "+date+"일");
	}
}

public class ClassEx08 {
	public static void main(String[] args) {
       MyDate08 md=new MyDate08(2022,6,17);//오버로딩 된 생성자 호출
       md.print();//0년 6월 17일
	}
}
