public class OprEx01 {
	public static void main(String[] args) {

		char c01='a';//'a'는 십진수 정수 97로 저장됌.
		char c02=c01;
		char c03=' ';
		
		int i=c01+1;//97+1=98
		System.out.println("i="+i);
		
		c03=(char)(c01+1);//97+1=98을 char타입으로 형변환을 하면 'b'
		System.out.printf("c03 = %c \n",c03);
		
		c02++;
		c02++;
		System.out.println("c02 = "+c02);
	}
}
