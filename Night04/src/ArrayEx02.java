
public class ArrayEx02 {

	public static void main(String[] args) {
		
		int[] score = new int[5];// 배열 크기가 5인 score배열 생성
		
		score[0]=95;
		score[1]=100;
		score[2]=90;
		score[3]=100;
		score[4]=90;//배열주소번호는 0부터 시작
		
		System.out.printf("배열크기 (원소개수) : %d%n",score.length);
		
		//일반 for반복문으로 배열 원소 값 출력
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"] : "+score[i]);
		}
		System.out.println("\n=============>");
		
		

	}

}
