/* NullPointerException 예외오류 클래스 특징)
 * 참조타입 변수만 선언을 하고 , null만 대입된 상태에서 해당클래스의 멤버변수에 접근할려다가 발생함.
 */
class Member04{
	String id = "abc12345";
	String name = "홍길동";
	String phone = "010-999-9999";
}
public class Except04 {
	public static void main(String[] args) {

		Member04 m = null;
		
		try {
			System.out.println("아이디: "+m.id+", 이름: "+m.name+", 폰번호: "+m.phone);
		}catch(Exception e) {
			System.out.println("예외 발생 : "+e);
			
			m = new Member04();//객체를 생성
			System.out.println("아이디: "+m.id+", 이름: "+m.name+", 폰번호: "+m.phone);
		}
	}

}
