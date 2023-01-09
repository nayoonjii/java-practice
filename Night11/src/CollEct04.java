import java.util.Enumeration;
import java.util.Vector;

/* java.util 패키지의Enumeration 인터페이스 특징)
 * 1. jdk 1.0에 추가되었고, 컬렉션에 저장된 복수개의 원소값을 읽어오는 용도로 활용된다.  
 * 2. 사용할때 같은 자바 버전에서 추가된 컬렉션에서 사용하면 좋다.
 */
public class CollEct04 {
	public static void main(String[] args) {
		
		Vector cityList = new Vector();
		
		cityList.add("서울시");
		cityList.add("부산시");
		cityList.add("인천시");
		
		Enumeration enu2 = cityList.elements();
		
		while(enu2.hasMoreElements()) {//원소값이 있다면 참
			System.out.print(" "+enu2.nextElement());//다음원소값을 가져옴
		}
		System.out.println("\n==================");
		
		while(enu2.hasMoreElements()) {
			System.out.print(" "+enu2.nextElement());
		}//한번사용하면 다시 사용 못하고 다시 사용할려면 생성하고 사용해야한다.
		System.out.println("\n==================");
		
		Enumeration enu3 = cityList.elements();
		while(enu3.hasMoreElements()) {
			System.out.print(" "+enu3.nextElement());
		}
		

	}

}
