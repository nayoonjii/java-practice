public class BlockEx10 {//클래스초기화 블록

	static int[ ] arr = new int [10];//배열크기가 10인 정적배열arr생성
	
	static {//클래스 초기화 블록으로 정적배열 원소값 초기화
		for(int i = 0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10)+1;/*random()메서드는 0.0이상 1.0미만 사이의 실수숫자 난수를 발생
			 *10하면 0.0이상 10.0미만 실수 숫자 난수 => (int)로 형변환 하면 소수점이하는 버리고 0이상 10미만-> +1하면 
			 *1이상 11미만 즉 1~10사이의 정수숫자 난수가 발생 */
		}
	}
	public static void main(String[] args) {
		//향상된 확장for로 반복 출력
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
