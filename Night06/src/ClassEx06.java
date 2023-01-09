class MyDate06{
	int year;
	int month;
	int date;
	
	MyDate06(){
		year=2021; month=12; date=31;//생성자의 기능인 멤버변수 초기화
	}//기본생성자
	
	MyDate06(int new_year, int new_month, int new_date){
		year=new_year;
		month=new_month;
		date=new_date;
	}//전달인자 개수가 다른 생성자 오버로딩
	
	void printYear() {
		System.out.println(year+"년 "+month+"월 "+date+"일");
	}//사용자 정의 메서드
}
public class ClassEx06 {
	public static void main(String[] args) {
/* 문제) 기본생성자를 호출한 md01객체를 생성한 다음 메서드를 호출해서 2021년 12월 31일을 출력되게 해본다. 그리고
 * 오버로딩 된 생성자를 호출해서 2022년6월17일을 출력되게 한다.
 */
		//코드시작
		MyDate06 md01=new MyDate06();
		md01.printYear();
        
		MyDate06 md02=new MyDate06(2022,6,17);
		md02.printYear();
	}
}






