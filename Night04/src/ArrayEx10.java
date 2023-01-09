
public class ArrayEx10 {

	public static void main(String[] args) {
		
		String[] names = {"kim","Choe", "Park"};
		
		//일반 for반복문으로 출력
		for(int i = 0; i<names.length;i++) {
			System.out.println("names["+i+"] :"+ names[i]);
		}//for
		
		String tmp = names[2];//3번째 벼열원소값 저장
		System.out.println("tmp : "+tmp);
		
		names[0] = "Lee";//첫번째 배열 원소값 변경
		
		System.out.println("\n=============>");
		//향상된 확장for문으로 출력
		for(String k: names) {
			System.out.println(k);
		}
		

	}

}
