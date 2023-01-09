
public class StringEx13 {
	public static void main(String[] args) {

		String fullName = "Hello.java";//파일명 저장
		int index = fullName.indexOf('.');//파일명에서 마침표 위치번호를 구함. 첫문자를 0부터 카운터
		System.out.println(". 의 위치번호: "+index);
		
		String fileName = fullName.substring(0,index);//0이상 5미만 사이의 문자를 반환
		System.out.println("확장자를 뺀 파일명: "+fileName);
		String ext = fullName.substring(index+1);//6이후부터 마지막 문자까지 구함. 첫문자는 0부터 카운터
		System.out.println(".을뺀 확장자: "+ext);//java
	}

}
