import java.util.Scanner;

public class ArrayEx16 {

	public static void main(String[] args) {
		
		final int SIZE = 5;
		int x = 0, y = 0;
		int num = 0;
		
		int [][] bingo = new int [SIZE][SIZE];//5*5행열 구조의 2차원 배열 생성
		Scanner scan = new Scanner(System.in);
		
		//1부터 25까지의 배열 원소값 초기화
		for(int i=0; i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				bingo[i][j] = i*SIZE+j+1;
			}
		}//for
		
		//배열원소값을 섞는다.
		for(int i = 0; i<SIZE;i++) {
			for(int j = 0;j<SIZE;j++) {
				x=(int)(Math.random()*SIZE);//random()메서드는0.0이상 1.0미만 사이의 실수 숫자 난수를 발생
				//*5하면 0.0이상 5.0미만 실수 숫자 난수 발생->(int)로 형변환을 하면 소수점 이하는 버리고, 0이상 4미만
				//즉 0~4사이의 정수 숫자 난수가 발생
				y = (int)(Math.random()*SIZE);
				
				int tmp = bingo[i][j];
				bingo[i][j]=bingo[x][y];
				bingo[x][y] = tmp;
			}
		}//for

		do {
			//섞여진 1~25사이 숫자 출력
			for(int i=0; i<SIZE;i++) {
				for(int j=0; j<SIZE; j++) {
					System.out.printf("%2d ",bingo[i][j]);
				}
				System.out.println();//개행
			}
			System.out.println();
			
			System.out.print("1~25사이 정수입력(종료: 0)>>");
			num = Integer.parseInt(scan.nextLine());
			
			outer://이중반복문을 중단하기 위한 레이블명 지정
				for(int i = 0; i<SIZE;i++) {
					for(int j=0;j<SIZE;j++) {
						if(bingo[i][j]==num) {
							bingo[i][j]=0;
							break outer;//이중for반복문을 중단
						}//if
					}//inner for
				}//outer for
		}while(num != 0);
		
	}

}
