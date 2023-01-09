
public class ArrayEx09 {

	public static void main(String[] args) {

		int[] numArr = new int[10];//배열크기가10인 numArr배열생성
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = i+1;//1~10까지 배열원소값 초기화
		}//for
		
		//향상된 확장 for반복문으로 출력
		for(int k:numArr) {
			System.out.print(" "+k );
		}
	System.out.println("\n======================\n");
	
	//원소값을 섞는다.
	for(int i=0;i<100;i++) {
		int n = (int)(Math.random()*10);//0.0이상 1.0미만 사이의 실수숫자 난수를 발생->*10하면 0.0이상
		//10.0미만 사이의 실수숫자 난수=>(int)로 형변환 하면 0이상 10미만 즉 0~9사이의 정수 숫자 난수 발생
		int tmp = numArr[0];
		numArr[0]= numArr[n];
		numArr[n]=tmp;
	}//for
	
	//일반 for반복문으로 출력
	for(int i=0;i<numArr.length;i++) {
		System.out.print(" "+numArr[i]);
	}
	}

}
