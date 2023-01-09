// for반복문,if조건문, %나머지 연산을 이용해서 1부터 10까지의 정수 중에서 홀수, 짝수의 총합을 각각 구하는 java 코드를 작성
public class Test2 {
	public static void main(String[] args) {

		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i<=10; i++) {
			if(i%2==0) {
				sum1 += i;
			}else {
				sum2 += i;
			}
		}
		System.out.println("짝수의 총합: "+sum1+", 홀수의 총합: "+sum2);
	}

}
