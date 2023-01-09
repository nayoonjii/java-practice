
public class ArrayEx03 {

	public static void main(String[] args) {
		
		int[] score = {95,70,80,75,100};//배열원소를 직접 초기화 하면서 score배열 생성
		int total=0;//배열원소 총합
		double average = 0.0;//배열원소 평균
		
		for(int i=0; i<score.length;i++) {
			total += score[i];
		}

		average = (double)total/score.length;//double/int는 자동산술법에 의해서 자료손실 위험이 없는 더 큰
		//타입으로 자동형변환을 해서 나눗셉 연산을 수행한다. 결국 double/double=double이 나온다.
		//실수 숫자를 나눗셈 하면 몫과 나머지 즉 소수점 이하 까지 평균을 구한다.
		
		System.out.println("배열원소 총합 = "+total);
		System.out.println("배열원소 평균 = "+ average);
		
	}

}
