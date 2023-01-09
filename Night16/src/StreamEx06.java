import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/* 숫자 범위로 부터 스틤을 생성해서 누적합 구하기 
 */
public class StreamEx06 {
	static int sum;//누적합을 저장할 정적변수
	
	public static void main(String[] args) {

		IntStream stream = IntStream.rangeClosed(1, 100);//1~100까지 숫자를 순차적으로 
		//제공하는 스트림을 생성
		stream.forEach(number -> sum+=number);//람다식을 사용해서 1~100까지 누적합
		System.out.println("1부터100까지 누적합 : "+ sum);
		System.out.println("\n=============>");
		
		/* 문제) 기존 일반 for반복문을 활용하여 1부터100까지 누적합을 구하는 코드를 작성한 다음 누적합을 출력
		 * 해보고, 동시에 1부터10까지의 임의의 정수 숫자 난수를 100번 발생해서 누적합을 자바5에서 추가된 향상된
		 * 확장for로 구한다음 출력해 본다.
		 */
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum +=i;
		}
		System.out.println("1부터100까지 누적합 : "+sum);
		
		sum = 0;
		
		for(int k = 1; k<=100; k++) {
			int number = (int)(Math.random()*10+1);
			sum += number;
		}
		System.out.println("1부터10사이의 정수숫자 난수를 100번 발생한 누적합 : "+sum);
		
		/* 문제2)1부터 10사이의 정수숫자 난수가100번발생한 것을 컬렉션 List에<Integer>제네릭타입으로
		 * 저장한 다음 자바5 추가된 확장 for반복문으로 누적합을 구한다음 출력해 본다.
		 */
		sum = 0;
		List<Integer> list = new ArrayList<>();
		for(int k = 1; k<=100; k++) {
			int number = (int)(Math.random()*10+1);
			list.add(number);//오토박싱 되면서 컬렉션List에 추가
		}
		sum = 0;
		for(int i:list) {
			sum+=i;
		}System.out.println("컬렉션 원소 누적합 = "+sum);
		
		
	}
}




