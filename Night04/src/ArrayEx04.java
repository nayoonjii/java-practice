
public class ArrayEx04 {

	public static void main(String[] args) {
		
		double[] data = {9.5, 7.0, 13.6, 7.5, 10.0};// 실수숫자를 직접 초기화 하면서 data[]배열생성
		
		double max = 0.0;//최대값
		max = data[0];//첫번째 배열원소값 저장
		
		double min = 0.0;
		min = data[0];
		
		for(int i = 1; i<data.length;i++) {
			//최대값을 구하는 알고리즘
			if(data[i]>max) {
				max = data[i];
			}else if (data[i]<min) {
				min = data[i];
				}
				
			}
			
			/*평가문제) 추가적인 else if 다중 조건문을 추가해서 배열원소 값에서 최소값을 구하는 
			 * 프로그램을 만들어보자
			 */
		//for

		System.out.printf("data배열원소중 최대값은? %4.1f%n",max);
		//%4.1f는 총자리수는 4자리, 소수점이하는 한자리를 표한하는 십진수 실수 숫자 출력형태 지시자.
		System.out.printf("data배열원소중 최소값은? %4.1f%n",min);
	}

}
