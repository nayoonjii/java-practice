class MyDate07{
	int year;
	int month;
	int date;
	
	public MyDate07(int new_year,int new_month,int new_date) {
		year=new_year;
		month=new_month;
		date=new_date;
	}//생성자 오버로딩
}
public class ClassEx07 {
	public static void main(String[] args) {

		new MyDate07();//생성자가 오버로딩이 되면 기본생성자를 묵시적 제공하지 않는다.그런대 기본생성자를 호출할려다가 
		//에러가 발생하는 것이다.
	}
}
