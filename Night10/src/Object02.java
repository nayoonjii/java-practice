/* Object의 toString()메서드를 자손에서 오버라이딩을 하여 자손에서 추가한 값을 문자열로 
 * 반환하기 위한 소스
 */
public class Object02 {

	public static void main(String[] args) {
		
		int a = 10, b = 10;
		if(a==b) {//기본자료형값은 == 로 비교한다. 즉 값만 비교. 결국 값이 같으니 true
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		System.out.println("============");
		
		String pwd01 = new String("56789");
		String pwd02 = new String("56789");//문자열내용 비번은 같지만 객체 주소가 다르다.
		
		if(pwd01==pwd02) {//참조타입인 레퍼런스 자료형을 ==로 비교하면 값을 비교하지 않고 주소값을 비교한다.
			//그러므로 주소값이 달라서false
			System.out.println("비번이 같다.");
		}else {
			System.out.println("비번이 다르다.");
		}//if else
		System.out.println("============");
	
		//결국 문자열 참조타입은 String클래스에 오버라이딩 된 equals()메서드를 사용해서 문자열 내용만 비교한다.
		
		if(!pwd01.equals(pwd02)) {
			System.out.println("비번이 다르다");
		}else {
			System.out.println("비번이 같다.");
		}
		
		System.out.println("============");
		
		if(pwd01.equals(pwd02)) {
			System.out.println("비번이 같다");
		}else {
			System.out.println("비번이 다르다.");
		}
	}

}
