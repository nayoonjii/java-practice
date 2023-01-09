/* StringBuffer에는 equals()메서드가 오버라이딩이 되지 않아서 object의 equals()메서드를
 * 상속받아서 사용하기 때문에 제대로 된 비교를 하지 못하고 객체주소값을 비교하게 된다. 
 */
public class StringEx14 {
	public static void main(String[] args) {

		StringBuffer sb01 = new StringBuffer("abc");
		StringBuffer sb02 = new StringBuffer("abc");//sb01과sb02는 각개체주소가 다르다
		
		if(sb01 == sb02) {//객체주소값 비교
			System.out.println("같다.");
		}else {
			System.out.println("다르다");
		}
		
		if(sb01.equals(sb02)) {//Object의 equals()메서드를 상속받아서 사용 =>주소값을 비교
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}//if else
		
		/* 문제) 문자열 내용 값만 비교해서 같다라고 나올수 있게 소스를 추가해보자. Api 사용하면 된다. 
		 */
		String s1 = sb01.toString();//문자열변환
		String s2 = sb02.toString();
		if(s1.equals(s2)) {//String 클래스의 오버라이딩 된 equals()매서드를 사용하기 떄문에 문자열
			//내용값만을 비교해서 제대로 된 비교를 하게 된다.
			System.out.println("내용물이 같다.");
		}else {
			System.out.println("내용물이 다르다.");
		}//if else
		
		
	}

}
