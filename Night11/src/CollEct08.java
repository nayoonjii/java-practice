import java.util.Enumeration;
import java.util.Hashtable;

/* java.util 패키지의 Map컬렉션 인터페이스를 구현한 Hashtable 컬렉션 클래스 특징)
 * 1. Map은 자바 2(jdk 1.2)에서 추가되었고, Hashtable은 자바1(jdk1.0)에서 추가됨
 * 2. 키,값 쌍으로 저장되는 사전적인 자료구조이다.
 * 3. 키를 통해서 값을 검색하기 때문에 검색속도가 빠르다.
 * 4. 저장된 순서를 유지하지 않는다. 
 */
public class CollEct08 {
	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
		
		ht.put("apple","사과");//키, 값 쌍으로 저장
		ht.put("grape","포도");
		ht.put("orange","오랜지");//키, 값 쌍이 object타입으로 업캐스팅이 되어져서 저장됨
		ht.put("banana","바나나");
		
		String val = (String)ht.get("apple");//apple키에 대한 값을 구함
		
		if(val != null) {
			System.out.println("apple : "+val);
		}
		
		/* 같은 자바 버전에서 추가된 Enumeration과 잘 맞는다. 이 이터페이스를 사용해서 값을 가져온다. 
		 */
		Enumeration enu2 = ht.keys();
		
		while(enu2.hasMoreElements()) {//키요소가 있다면 참
			Object k = enu2.nextElement();//키를구함
			Object v = ht.get(k);
			System.out.println(k+" : "+v);
		}//while end
	}

}
