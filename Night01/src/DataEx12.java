public class DataEx12 {
	public static void main(String[] args) {

		byte b=127;
		byte c=126;
		
		//byte result = b+c;
		/* b+c는 값 손실 위험이 없고 연산 수행속도가 빠르고 효율적인 int타입으로 자동형 변환을 해서 int+int=int 결과가 나온다. 
		 * int타입의 결과를 byte형에 저장할 려면 명시적인 캐스팅 형 변환을 해줘야 한다.
		 */
		
		int result=b+c;
		System.out.println("result = "+result);
	}
}
