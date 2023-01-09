
public class ArrayEx05 {

	public static void main(String[] args) {

		int[][] score = new int[3][2];//3행*2열의 score 2차원 배열 생성
		
		score[0][0] = 90; score[0][1] = 100; 
		score[1][0] = 100; score[1][1] = 95;
		score[2][0] = 90; score[2][1] = 80;
		
		//이중 for반복문으로 일괄적으로 2차원 배열원소값 출력
		for(int row = 0; row<score.length;row++) {//score.length는 행의 길이3
			for(int col=0;col<score[row].length;col++) {//score[row].length는 각행의 열의 길입2
				System.out.print(" "+score[row][col]);
			}//inner for
			System.out.println();//개행 줄바꿈
		}//outer for
		
	}

}
