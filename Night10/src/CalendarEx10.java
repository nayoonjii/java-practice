import java.util.Calendar;
import java.util.GregorianCalendar;

/*윤년인지 아닌지를 판단하기 위한 소스 
 */
public class CalendarEx10 {

	public static void main(String[] args) {

		GregorianCalendar gcal = new GregorianCalendar();
		
		
		int year = gcal.get(Calendar.YEAR);//년도값
		
		System.out.print(" "+year+"년은");
		
		if(gcal.isLeapYear(year)) {//윤년이면 참, isLeapYear()메서드는 윤년인지 아닌지를 판단해서 boolean
			//타입 즉 true or false로 반환
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}//if else
		
		
	}

}
