import java.util.HashSet;
import java.util.Set;

/* java.util패키지의 컬렉션 Set인터페이스의 특징)
 * 1. 하나이상의 복수개의 원소값과 자료형을 동시 저장 가능하다.
 * 2. 가변적 배열이다. 값 증가, 감소가 가능하다.
 * 3. 중복원소값을 허용하지 않는다. 순서 없이 저장된다. => Set컬랙션의 특징
 */
public class CollEct01 {

	public static void main(String[] args) {
		
		Set set = new HashSet();//Set과 이를 구현상속해서 만든 컬렉션 클래스 HashSet은 jdk 1.2에서 추가됨
		
		set.add("홍길동");//컬렉션에 원소값추가
		set.add("이순신");
		set.add("홍길동");
		set.add(100);//오토박싱(기본타입이 래퍼타입이로 자동형변환)+업캐스팅
		set.add(100.3);
		
		System.out.println("원소개수: "+set.size());
		System.out.println(set);//중복원소값을 허용하지 않고, 순서를 보장하지 않는다.
		
	}

}
