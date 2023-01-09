
//String 클래스 하위의 메서드 대해서 학습한다.

public class StringEx06 {

	public static void main(String[] args) {
		
		String str01 = "java";
		System.out.println("영문 대문자로 변경: "+str01.toUpperCase());//String문자열 str01자체가 
		//변경되지는 않는다.
		System.out.println("str01 :"+str01);
		
		String str02 = "Java";
		String str03 = new String(" Programming");
		
		System.out.println("\'"+str02+"\' 문자열 길이 = "+(str02.length()));
		
		String resultString = str02.concat(str03);//두문자열을 연결
		System.out.println("두문자열을 연결: "+resultString);
		System.out.println("Java에서 3번째 단일문자: "+str02.charAt(2));
		//charAt(2)메소드는 첫문자를 0 부터 카운터해서 3번째 단일문자를 구함.v
		
		System.out.println("\' Programming\' 에서 r이 몇번째에 저장되었는가?"+((str03.indexOf('r')+1)));
		//indexOf('r') 메서드는 'r'을 맨 왼쪽에서 부터 찾아서 가장 먼저 나오는 해당문자 위치번호를 반환. 첫문자는0부터시작함
	
		
		/* 문제) ' Programming' 에서 'r'을 맨 오른쪽에서 부터 찾아서 가장 먼저 나오는 해당 문자 위치번호를 맨 왼쪽부터 
		 * 카운터 한 다음 +1을 반환하자. 물론 첫문자는 0부터 카운터한다. 
		 */
		System.out.println("\' Programming\' 에서 r이 오른쪽에서 몇번째에 저장되었는가?"+((str03.lastIndexOf('r')+1)));
		
	}

}
