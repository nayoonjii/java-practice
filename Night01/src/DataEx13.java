public class DataEx13 {
	public static void main(String[] args) {
/* 자바의 산술/수학 연산자 종류와 특징)
 *  +(덧셈), -(뺄셈), *(곱셈), /(나눗셈: 정수 숫자를 나눗셈 하면 몫만 구함. 실수 숫자를 나눗셈하면 몫과 나머지를 함께 구함)
 *  %(나머지 연산)
 */
		
		int a=10,b=4,result=0;
		
		result=(a*b);
		System.out.println(a+" * "+b+" = "+result);
		
		result=(a/b);
		System.out.println(a+" / "+b+" = "+result);
		
		double re=(10.0/4);//double/int는 자동 산술법에 의해서 double/double=double이 된다. 즉 실수 숫자를 나눗셈하면 몫과 나머지를
		//함께 구함
		System.out.println(re);
		
		result=(10%3);
		System.out.println("나머지 = "+result);
	}
}
