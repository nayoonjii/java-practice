
public class ArrayEx07 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		//배열 arr에 1~5까지 저장
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println("변경전 - arr.length: "+ arr.length);
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr["+i+"] : "+ arr[i]);
		}//배열원소값 출력
		int[] tmp = new int[arr.length*2];//배열크기가 10인tmp배열 생성
		
		//배열 원소값 복사
		for(int i = 0; i<arr.length; i++) {
			tmp[i] = arr[i];
			
		}

		arr = tmp;//tmp배열주소를 대입
		
		System.out.println("변경후 - arr.length : "+ arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		
		System.out.println("\n=====================>");
	}

}
