/* 래퍼클래스와 오토박싱과 오토언박싱)
 * 1. 래퍼클래스란 자바 기본타입 8개를 포장해서 래퍼클래스화 한것을 말한다.
 * 2. 자바5버전 이후부터 자바 기본타입을 래퍼 클래스형으로 자동형변환을 하는것을 오토 박싱이라고한다. 그반대가 오토언박싱이다. 
 */
public class AutoEx05 {
	public static void main(String[] args) {

		int n01 = 10;
		int n02;
		Integer num01;
		Integer num02 = new Integer(20);
		
		num01 = n01;// 오토박싱
		n02 = num02;//오토 언박싱
		
		System.out.println("오토박싱된 값: "+num01);
		System.out.println("오토언 박싱 된 값: "+n02);
	}

}
