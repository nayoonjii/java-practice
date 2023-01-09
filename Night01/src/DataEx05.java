public class DataEx05 {
	public static void main(String[] args) {

		int finger=10;
		
		System.out.printf("finger=[%5d] %n", finger);//%5d는 기본정렬을 오른쪽으로 하고,빈자리는 공백으로 채움.
		
		System.out.printf("finger=[%-5d] %n", finger);//%-5d는 기본정렬을 왼쪽으로 하고 ,빈자리는 공백으로 채움.
		
		System.out.printf("finger=[%05d] %n", finger); //%05는 오른쪽 정렬을 기본으로 하고,빈자리는 0으로 채움.
		
		int octNum = 010;//8진수 정수 출력형태
		int hexNum = 0x10;//16진수 정수 출력형태
		int binNum = 0b10;//2진수 정수 출력형태
		
		System.out.printf("octNum = %o , %d%n", octNum, octNum); //%o는 8진수 정수 출력형태
		System.out.printf("hexNum=%X, %d%n", hexNum, hexNum);//%x(X)는 16진수 정수 출력형태
		System.out.printf("binNum=%s, %d",Integer.toBinaryString(binNum),binNum);
		//Integer.toBinaryString() 메서드는 정수를 이진 문자열로 변환, %n은 줄바꿈.
	}
}
