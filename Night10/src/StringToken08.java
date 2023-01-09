import java.util.StringTokenizer;

/* 구분자 기호를 기준으로 문자를 분리한다. 분리된 문자를 토큰문자라고 한다. 즉 문자열을 파생시키는 연습니다.
 * 
 */
public class StringToken08 {

	public static void main(String[] args) {
		String phone = "010-777-7777";
		
		StringTokenizer ph = new StringTokenizer(phone,"-");//-구분자를 기준으로 폰번호를 분리

		System.out.println("첫번째 분리된 폰번호: "+ph.nextToken());
		System.out.println("두번째 분리된 폰번호: "+ph.nextToken());
		System.out.println("세번째 분리된 폰번호: "+ph.nextToken());
		
		/* 분리된 폰번호는 한번 사용하면 다시 사용 못한다. 다시 사용하기 위해서는 새로 생성해서 사용해야한다.
		 */
		
		System.out.println("======================>");
		
		StringTokenizer ph2 = new StringTokenizer(phone,"-");
		
		System.out.println("첫번째 분리된 폰번호: "+ph2.nextToken());
		System.out.println("두번째 분리된 폰번호: "+ph2.nextToken());
		System.out.println("세번째 분리된 폰번호: "+ph2.nextToken());
	}

}
