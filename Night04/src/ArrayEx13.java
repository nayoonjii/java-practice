
public class ArrayEx13 {

	public static void main(String[] args) {
		
		int[][] score = {
				{100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
		};//4행*3열의 2차원 배열 생성
		
		int sum = 0;//배열원소 누적합
		
		//일반 이중for반복문으로 배열원소값 출력
		for(int i = 0; i<score.length;i++) {//score.length는 배열의 행 길이를 반환 =>4
			for(int j=0;j<score[i].length;j++) {//score[i].length는 각 행의 열의 길이를 반환
				System.out.print(" "+score[i][j]);
			}
			System.out.println();
			
		}
		System.out.println("\n=========\n");
		
		//향상된 확장for로 누적합
		for(int[] arr: score) {//score2차원 배열을 arr 일차원 배열로 변경
			for(int k:arr) {//1차원 배열을 일반변수 k로 해서 원소값을 저장
				sum += k;
			}//inner for
		}//outer for

		System.out.println("누적합 = "+sum);
	}

}
