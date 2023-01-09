public class DataEx11 {
	public static void main(String[] args) {

		byte var01=127;
		short var02=128;
		int var03=128;
		long var04=128L;
		
		var04=var01;//더 큰자료형으로 자동형 변환.
		System.out.println("var04 = "+var04);
		
		//var01=var03;//4바이트 크기의 int타입을 1바이트 크기의 byte형에 저장할려면 값 손실 위험이 발생하기 때문에 자동형변환을 안해준다.
		//그러므로 명시적인 캐스팅 형변환을 해야 한다. byte형 최대값 범위를 벗어나서 최소값이 저장.
		var01=(byte)var03;
		System.out.println("var01 = "+var01);
		
		float var05=123456.789123f;
		double var06=123456.789123;
		
		System.out.println("var05="+var05);
		var05=(float)var06;
		System.out.println("var05="+var05+",var06="+var06);
	}
}
