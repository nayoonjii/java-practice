public class Ex04_01 {
	public static void main(String[] args) {

		int num01=7;
		int num02=8;
		String result="";
		
		result=(num01 % 2 == 0)? "짝수":"홀수";
		System.out.println(num01+"은 "+result+" 이다.");
		
		result=(num02 % 2 == 1)?"홀수":"짝수";
		System.out.println(num02+"는 "+result+" 이다.");
	}
}
