
public class ArrayEx15 {

	public static void main(String[] args) {
		
		final int MAX_ROWS = 5;//final선언된 상수명	MAX_ROWS는 수정할 수없는 변수 즉 상수가 된다.
		/*상수명 특징
		 * 1. final키워드로 정의한다
		 * 2. 상수명은 관례적으로 영문대문자로 한다
		 * 3. 선언과 동시에 초기화를 해야한다
		 */

		int[][] ragged = new int[MAX_ROWS+1][];//행의 크기는 6이고, 열의크기는 지정되지 않고 가변적인 래그드
		//(래기드)배열 생성
		
		for(int r=0; r<=MAX_ROWS;r++) {
			ragged[r] = new int [r+1];//각 행의 크기를지정
		}//for
		
		for(int r=0; r<ragged.length;r++) {//ragged.length는 행의 크기 6
			for(int c=0; c<ragged[r].length;c++) {//ragged[r].length는 각행의 열의 길이(크기)
			ragged[r][c] = c;//배열원소값 초기화
		}//inner for
	}//outer for
		
		//가변 배열인 래기드 배열 원소값을 출력
		for(int r=0; r<ragged.length;r++) {
			for(int c=0;c<ragged[r].length;c++) {
				System.out.print(" "+ragged[r][c]);
			}
			System.out.println();//개행
		}//outer for

	}
}