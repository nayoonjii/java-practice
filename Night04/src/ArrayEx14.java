
public class ArrayEx14 {

	public static void main(String[] args) {
		
		int[][] score = {
				{100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
				,{50,50,50}
		};//5행*3열의 2차원 배열 score생성
		
		//각 과목별 총점
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("  번호  국어   영어     수학   총점   평균");
		System.out.println("==========================>");
		
		for(int i = 0; i<score.length;i++) {//score.length는 행의 크기 (길이) =>5
			int sum = 0;//개인별 총점
			double average = 0.0;//개인별 평균
			
			korTotal += score[i][0];//국어점수 총합
			engTotal += score[i][1];//영어점수 총합
			mathTotal += score[i][2];//수학점수 총합
			
			System.out.printf("%3d", i+1);
			
			for(int j=0; j<score[i].length;j++) {
				sum += score[i][j];
				System.out.printf("%5d",score[i][j]);
			}
			average = sum/(double)score[i].length;//score[i].length는 각행의 열의 길이=>3
			//int/double은 자동산술법에 의해서 double/double = double이 된다. 결국 평균은 몫과 나머지를 함ㄲㅔ구함
			System.out.printf("%5d %5.1f%n",sum,average);
			//%5.1f는 총자리수가 5자리, 소수점이하는 첫번째 자리까지 십진수 실수 숫자 출력형태
		}
		
		System.out.println("\n=====================>");
		System.out.printf("총점:%3d %4d %4d %n",korTotal,engTotal,mathTotal);//각과목별 총점
	}

}
