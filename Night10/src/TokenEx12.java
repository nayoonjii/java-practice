/* String 클래스 하위에 split()메서드를 사용하면 구분자를 기준으로 문자열을 분리해서 
 * 배열로 반환한다. 분리된 문자를 토큰 문자열이라고 한다. 
 */
public class TokenEx12 {
	public static void main(String[] args) {
		String phone = "010-9999-9999";
		String[] phArr = phone.split("-");//-를 기준으로 폰번호를 분리해서 문자열 배열로 반환
		
		//일반for반복문으로 분리된 폰번호 배열원소값 출력
		for(int i = 0; i<phArr.length;i++) {
			System.out.println(phArr[i]);
		}
		System.out.println("=================>");
		
		//향상된 확장 for반복문으로 처리
		for(String ph:phArr) {
			System.out.println(ph);
		}
	}

}
