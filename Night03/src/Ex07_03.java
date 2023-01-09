
public class Ex07_03 {

	public static void main(String[] args) {

		int i;
		for (i=2;i<=100;i+=2) {
			System.out.print(" "+i);
			if(i % 20 ==0) {//20배수일때 실행
			System.out.println();//줄바꿈=>개행	
			}
			
		}
	}

}
