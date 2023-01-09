import java.util.Arrays;
import java.util.List;

/* <?> 제네릭 타입 와일드카드 문법)
 *  모든 객체타입을 배치할수있다.
 */
class MyList{
	public static void printList(List<?> list) {
		for(Object obj:list) {
			System.out.print(" "+obj);
		}
		System.out.println("\n==================");
	}//printList()
}
public class CollEct15 {
	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(10,20,30);//Arrays.asList()는 배열을 컬렉션 List로 변경
		List<String> li2 = Arrays.asList("seoul","busan");
		
		MyList.printList(li);
		MyList.printList(li2);
		
	}

}
