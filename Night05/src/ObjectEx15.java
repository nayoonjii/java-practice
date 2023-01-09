class Mt15{
	int year=2021;
	int month=12;
	int date=31;
}

public class ObjectEx15 {
	public static void main(String[] args) {

		int x=7;
		int y=x;//값이 복사
		
		System.out.println("x="+x+",y="+y);
		
		y=10;//x변수값에 영향 안준다.
		System.out.println("x="+x+",y="+y);//7 10
		
		Mt15 m=new Mt15();//객체주소가 저장된 참조변수 m(객체명,인스턴스명,실개체)
		Mt15 t=m;//t와 m은 같은 객체주소를 가리킨다.
		
		System.out.println(m.year+"년 "+m.month+"월 "+m.date+"일");//2021년 12월 31일
		System.out.println(t.year+"년 "+t.month+"월 "+t.date+"일");//2021년 12월 31일
		
		t.year=2022; t.month=6; t.date=16;//주소값을 공유하기 때문에 m으로 접근한 년월일도 변경된 값을 공유한다.
		
		System.out.println(m.year+"년 "+m.month+"월 "+m.date+"일");//2022년 6월 16일
		System.out.println(t.year+"년 "+t.month+"월 "+t.date+"일");//2022년 6월 16일
	}
}
