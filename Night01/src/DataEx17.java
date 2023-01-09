public class DataEx17 {
	public static void main(String[] args) {
/* 증감 연산자 종류)
 *  i++(나중에 1증가), ++i(먼저 1증가=>선행증가), i--(나중에 1 감소),--i(먼저 1감소=>선행감소),
 * 
 *  i+=5(5증가), i=i-3(3감소)
 */
		int a=10;
		System.out.println(a++);//먼저 10을 출력하고 나중에 1증가
		System.out.println(a);
		
		a=10;
		int b=a--;//a변수값 10을 b변수에 저장하고 나중에 1감소
		System.out.println("b="+b+",a="+a);//10,9
		
		a=10;
		a=a+5;
		System.out.println(a);//15
		
		a=10;
		a-=3;
		System.out.println(a);//7
	}
}
