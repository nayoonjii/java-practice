import java.util.LinkedList;

/* java.util패키지의 컬렉션 클래스 LinkedList 특징)
 * 1. jdk 1.2 에서추가되었고, 입구와 출구가 다르다. 그래서 먼저 들어온것이 먼저 나가는 구조이다.
 * 		First Input First Output 구조이다. FIFO구조이다. 
 */
public class CollEct07 {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.offer("1-Java");//원소값 추가
		list.offer("2-Oracle");
		list.offer("3-Jsp");
		
		while(list.peek() != null) {//원소값이 있다면
			System.out.println(list.poll());//원소값 제거하면서 꺼내옴 입력한순서 그대로나옴
		}

	}

}
