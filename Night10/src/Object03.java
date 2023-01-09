/* 1. 기본 자료형 값 비교는 == 같다 비교연산자러 처리한다.
 * 2. String 문자열 내용물 값만 비교하기 위해서는 해당 클래스의 equals()메서드를 사용해서 문자열 내용물 값만
 * 같다.다르다를 비교해야한다.
 * 3. String 참조타입을 == 비교연산으로 비교하면 객체주소값을 비교해서 제대로 된 비교를 할수 없다.
 */
public class Object03 {

	public static void main(String[] args) {

		String pwd01 = "123456";
		String pwd02 = "123456";
		
		if(pwd01==pwd02) {//주소값을 비교
			System.out.println("비번이 같다.");
		}else {
			System.out.println("비번이 다르다.");
		}
		
		String pwd03 = "12345";
		String pwd04 = new String("12345");//new연산 키워드로 새로운 객체주소를 만들었다.
		
		if(pwd03 == pwd04) {//객체주소값을 비교 => 주소값이 달라서 false
			System.out.println("비번이 같다.");
		}else {
			System.out.println("비번이 다르다");
		}
		

	}

}
