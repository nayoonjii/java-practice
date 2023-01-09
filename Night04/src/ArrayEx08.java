
public class ArrayEx08 {

	public static void main(String[] args) {

		int[] score = {100,88,100,100,90};
		int sum = 0;//배열원소 누적합
		double average = 0.0;//평균
		
		//자바 5 에서 추가된 향상도니 확장 for반복문으로 배열원소 누적합
		for(int k: score) {
			sum += k;
			
		}
		
		average = sum/(double)score.length;//int/double은 자동 산술법에 의해서 double/double이된다.
		//결국 평균은 double 타입이 되어서 몫과 나머지를 함께구함
		
		System.out.println("총점 = "+sum);
		System.out.println("평균 = "+ average);
		//배열원소 최대, 최소값
		int max = score[0];
		int min = score[0];
		
		for(int i =0; i<score.length;i++) {
			if(score[i]>max) {
				max = score[i];
			}else if(score[i]<min) {
				min = score[i];
				
			}
		}
		
		System.out.println("배열원소 최대값 = "+max);
		System.out.println("배열원소 최소값 = "+min);
	}

}
