import java.util.HashMap;
import java.util.Map;

//java.util패키지의 Map을 구현한 HashMap
public class CollEct19 {
	public static void main(String[] args) {

		Map<String,Integer> m = new HashMap<>();
		String[] sample = {"to","be","or","not","to","be","is","a","prolem"};
		
		//자바5에서 추가된 향상된 확장for반복문=> 배열이나 컬렉션에 저장된 복수개의 원소값을 읽어오는 용도
		for(String a: sample) {
			Integer freq = m.get(a);//키에대한 값을 구함.
			m.put(a, (freq==null)?1:freq+1);//단어 빈도수가 값으로 저장
		}
		
		System.out.println(m);//맵자료구조 출력
		
	}

}
