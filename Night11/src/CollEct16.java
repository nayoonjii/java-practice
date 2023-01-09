import java.util.Arrays;
import java.util.List;

//제네릭타입 와일드카드 문법
public class CollEct16 {
	public static void addNumber(List<? super Integer> list) {
		/* <? super Integer> 제네릭 타입 와일드 카드 문법은 Integer타입의 조상만
		 *  제네릭 타입 형변환을 허용한다. 
		 */
		for(int i = 0; i<list.size(); i++) {
			System.out.print(" "+list.get(i));//get()메서드로 요소값을 가져옴
		}
		System.out.println("\n===================");
	}//addNumber()
	public static void main(String[] args) {

		Number[] arr = {10,20,30};
		Object[] arr2 = {1000,200,3000};
		List<Number> li = Arrays.asList(arr);
		addNumber(li);
		List<Object> li2 = Arrays.asList(arr2);
		addNumber(li2);
		
	}

}
