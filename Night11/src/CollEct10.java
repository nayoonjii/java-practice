import java.util.ArrayList;
import java.util.List;

/* jdk 1.7부터는 뒤부분 <> 제네릭스 즉 제네릭 타입을 생략할 수 있다. 이유는앞부분만 제네릭 타입이 지정되어 있어도 뒷부분은
 *  알수가 있기 뗴문에 생략가능하다.
 * 키, 값 쌍으로 저장하는 맵 사전적인 자료구조에 제네릭 타입을 지정해 본다.
 */

public class CollEct10 {
	public static void main(String[] args) {

		List<Double> numList = new ArrayList<>();//실수숫자값만 저장가능하다.
		numList.add(100.6);
		numList.add(95.3);
		numList.add(100.5);
		
		double sum = 0;
		//일반for반복문으로 출력
		for(int i = 0; i<numList.size();i++) {
			double result = numList.get(i);//오토언박싱이 적용되면서 원소값 반환
			sum += numList.get(i);//실수 누적합
			System.out.print(" "+result+"\t");
		}
		System.out.println("\n 실수누적합 = "+sum);
	}

}
