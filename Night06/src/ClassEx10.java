class MyDate10{
	int year;//년도
	int month;//월
	int date;//일
	
	public MyDate10(){
		this(2022,6,17);//같은 클래스내의 다른 생성자(오버로딩 된 생성자)를 호출
	}

	public MyDate10(int year, int month, int date) {
		this.year=year;
		this.month=month;
		this.date=date;
	}//전달인자 개수가 다른 생성자 오버로딩
	
	public void pr() {
		System.out.println(year+"/"+month+"/"+date);
	}//사용자 정의 메서드
}

public class ClassEx10 {
	public static void main(String[] args) {

		MyDate10 md=new MyDate10();//기본 생성자 호출
		md.pr();
	}
}
