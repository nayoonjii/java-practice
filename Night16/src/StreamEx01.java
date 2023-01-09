import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/* 컬렉션에 저장된 복수개의 원소값을 기존방법인 Iterator 컬렉션 인터페이스를 활용해서 가져오는 경우와 
 * 자바8에서 추가된 스트림을 활용해서 가져오는 법에대해서 학습한다.
 */
public class StreamEx01 {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("홍길동","신용권","강감찬");
		//배열을 컬레션 List로 변경
		
		//기존방법인 Iterator를 통해서 가져옴
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {//다음 원소값이 있다면 참
			String name = iterator.next();//다음 원소값을 가져옴
			System.out.println(name);
		}
		
		System.out.println("\n================>");
		
		//Stream을 이용
		Stream stream = list.stream();
		stream.forEach(name->System.out.println(name));
		System.out.println("\n=================\n");
		
	}
}
