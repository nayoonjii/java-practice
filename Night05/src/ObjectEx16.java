class Mt16{
	int year=2021;
	int month=12;
	int date=11;
}
public class ObjectEx16 {
	public static void main(String[] args) {

		Mt16 d=new Mt16();
		Mt16 t=d;//t와 d는 같은 객체주소를 가진다.
		
		System.out.println(d.year+"년 "+d.month+"월 "+d.date+"일 ");
		System.out.println(t.year+"넌 "+t.month+"월 "+t.date+"일 ");
		
		t=new Mt16();//새로운 객체주소를 할당.그러므로 t 와 d 는 다른 주소를 가짐.값도 공유 안함.
		
		t.year=2022; t.month=6;  t.date=16;
		
		System.out.println(d.year+"년 "+d.month+"월 "+d.date+"일 ");
		System.out.println(t.year+"넌 "+t.month+"월 "+t.date+"일 ");
	}
}
