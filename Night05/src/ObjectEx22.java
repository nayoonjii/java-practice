class Mt22{
	
	void printArr(int[] numArr) {
		
		for(int k:numArr) {
			System.out.print(" "+k);
		}
		System.out.println("\n==================\n");
	}
}
public class ObjectEx22 {	
	public static void main(String[] args) {

		int[] arr = {3,2,1,6,5,4};
		
		//첫번째 배열원소값 출력
		for(int a:arr) {
			System.out.print(" "+a);
		}
		System.out.println("\n==========\n");
		
		//두번째 배열원소값 출력
		for(int b:arr) {
			System.out.print(" "+b);
		}
		System.out.println("\n==================\n");
		Mt22 m22=new Mt22();
		m22.printArr(arr); m22.printArr(arr); m22.printArr(arr);
	}
}
