import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* java2 에서 추가된 java.util패키지의 Iterator인터페이스 특징)
 * 
 *  1. 컬렉션에 저장된 복수개의 원소값을 쉽게 읽어오는 용도로 많이 활용
 */
public class CollEct03 {
	public static void main(String[] args) {
		
		List nameList = new ArrayList();
		
		nameList.add("홍길동");
		nameList.add("이순신");
		nameList.add("강감찬");//업케스팅 하면서 저장
		
		Iterator it2 = nameList.iterator();//한번사용하면 다시 사용못함. 다시 사용할려면 생성하시고 사용해야한다.
		
		while(it2.hasNext()) {//다음원소값이 있다면 참
			System.out.print(" "+it2.next());//next()메서드로 다음 원소값을 가져온다.
		}
		System.out.println("\n================");
		
		while(it2.hasNext()) {//한번 사용했기 때문에 다시 사용못한다.
			System.out.print(" "+it2.next());
		}
		
	}
}
