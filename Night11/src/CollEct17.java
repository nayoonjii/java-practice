import java.util.ArrayList;
import java.util.ListIterator;
//컬렉션에 저장된 복수개의 원소값을 양방향조회
public class CollEct17 {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		/* java.util패키지의 컬렉션 ListIterator 인터페이스 특징)
		 *  1. jdk1.2에서 추가되었고, Iterator인터페이스를 상속받았고, 양방향 조회가 가능하다.
		 *  2. Iterator 인터페이스는 다음방향 즉 단방향 조회만 가능하다.
		 *  3. 결국 컬렉션에 저장된 복수개의 원소값을 읽어오는 용도로 활용된다.
		 *  4. 컬렉션 List인터페이스를 상속받은 자손에서 사용가능하다.
		 */
		
		//순방향 즉 다음방향 조회
		while(it.hasNext()) {//다음 원소값이 있다면 참
			System.out.print(" "+it.next());//next() 메서드로 다음원소값을 읽어옴.
		}
		System.out.println("\n==================");
		
		//역방향 즉 이전방향 조회
		while(it.hasPrevious()) {//이전원소값이 있다면 참
			System.out.print(" "+it.previous());//이전원소값을 읽어옴
		}
		System.out.println("\n==================");
	}

}
