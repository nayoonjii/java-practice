import java.util.Arrays;

public class ArrayEx06 {

	public static void main(String[] args) {

		int[] score = new int[5];//배열크기가 5인 일차원 배열 score생성
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int result = score[k+2]+ score[4];//80+90=170
		
		System.out.printf("result = %d \n", result);
		
		//for 반복문으로 배열원소값 출력
		for (int i = 0; i<score.length;i++) {
			System.out.println("score["+i+"] : "+ score[i]);
		}
		
		System.out.println("\n====================>\n");
		
		System.out.println(Arrays.toString(score));
		//toString()메서드는 배열의 모든 요소를 [첫번재 원소값,두번째 원소값...]
		//와 같은 형식의 문자열로 만들어서 반환
		
		char[] chArr = {'a','c','d'};
		System.out.println(chArr);
	}

}
