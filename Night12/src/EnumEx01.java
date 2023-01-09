import java.util.Calendar;

//열거타입을 사용한 예
public class EnumEx01 {
	public static void main(String[] args) {

		Week today = null;//열거타입으로 참조(레퍼런스)변수선언
		
		Calendar cal = Calendar.getInstance();
		//Calendar는 추상클래스로 new로 객체생성을 못한다. 년월일 시분초 등을 반환해준다.
		int week = cal.get(Calendar.DAY_OF_WEEK);//일요일 (1)~ 토요일(7)
		
		switch(week) {
		case 1 :
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7: 
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘요일: "+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 등산과 축구를 한다.");
		}else {
			System.out.println("자바 열공한다.");
		}
	}

}
