import java.util.Calendar;

/* java.util패키지의 칼렌더 추상클래스를 활용한 실습)
 * 년, 월, 일, 시, 분, 초 값을 반환
 */


public class CalendarEx09 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();//칼렌더는 추상클래스로서 new키워드로 객체생성을 못함
		
		int year = cal.get(Calendar.YEAR);//년도
		int month = cal.get(Calendar.MONTH)+1;//월값, 1월이 0으로 반환되기 때문에 +1해야한다.
		int date = cal.get(Calendar.DATE);//일값
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);//24시간값
		int min = cal.get(Calendar.MINUTE);//분값
		int sec = cal.get(Calendar.SECOND);//초값
		
		System.out.println(year+"년"+month+"월"+date+"일");
		System.out.println(hour+"시"+min+"분"+sec+"초");
		
	}

}
