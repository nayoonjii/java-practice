
public class ArrayEx11 {

	public static void main(String[] args) {
		
		String str = "ABCDE";
		char result = str.charAt(3);//charAt(3)메서드 기능은 첫분자를 0부터 카운터해서 4번째 단일 문자를 구함.
		System.out.println("\'ABCDE\' 에서 4번째 문자: "+ result);
		
		str = "012345";
		String tmp = str.substring(1,4);//첫문자를 0부터 카운터해서 1이상 4미만 사이의 문자 반환
		System.out.println("tmp : "+tmp);
		
		String src = "ABCDE";
		System.out.println("\'ABCDE\' 문자길이: "+src.length());//length()메서드는 첫문자를 1부터 카운트
		//하고 문자 길이 반환
		for(int i = 0;i<src.length();i++) {
			char ch = src.charAt(i);//i번째 단일문자를 구함
			System.out.println("src.charAt("+i+") : "+ch);
			
		}
		char[] chArr = src.toCharArray();//String 문자열을 char[]배열로 변경
		System.out.println(chArr);//char타입 배열원소값 출력
	}

}
