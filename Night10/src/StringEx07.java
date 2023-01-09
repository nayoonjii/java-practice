/* StringBuffer 클래스 특징과 그 하위의 메서드에 대한 학습 소스)
 * 1. String클래스 자기 자신의 내용을 수정하지 못하지만 StringBuffer는 자기 자신 내용을 수정할수 있다.
 */
public class StringEx07 {

	public static void main(String[] args) {
		
		StringBuffer str01 = new StringBuffer();
		str01.append("Java");//현재 문자열끝에 추가해서 자기 자신 내용이 변경
		System.out.println(str01.toString());//문자열로 변환해서 출력 =>Java
		str01.append(" Programming");
		System.out.println(str01.toString());//Java Programming
		
		str01.replace(0, 4, "MFC");//0이상4미만 사이의 문자열을 변경
		System.out.println(str01.toString());//MFC Programming
		
		String result = str01.substring(3);//첫문자를 0부터 카운터해서 3이후부터 마지막 문자까지 반환
		System.out.println(result);//' Programming'
		
		str01.deleteCharAt(0);//첫문자를 지운다.
		System.out.println(str01.toString());//FC Programming
		
		str01.reverse();//문자역순
		System.out.println(str01.toString());

	}

}
