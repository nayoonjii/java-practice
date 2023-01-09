//사용자 정의 예외 처리 클래스를 만들어서유효성 검증 메시지(Validate)를 띄우기

class UserException extends Exception{
	public UserException(String str) {
		super(str);//조상클래스 오버로딩 된 생성자를 호출하면서 경고메시지(Validate)를 생성
	}
}
public class Except07 {
	public static void main(String[] args) {
		try {
			int a = -11;
			if (a<=0) {
				throw new UserException("양수가 아닙니다.");//인위적 예외발생
			}
		}catch(UserException ue) {
			System.out.println(ue.getMessage());//예외 에러메시지를 출력=>양수가 아닙니다.
		}
	}
}
