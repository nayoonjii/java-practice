import java.util.ArrayList;
import java.util.List;

/* java.util 패키지의 List컬렉션 인터페이스 특징)
 * 1. 복수개의 원소값과 타입을 동시 저장가능하다.
 * 2. 가변적배열이다.
 * 3. 중복원소값을 허용하고, 저장된 순서를 보장한다. 
 */
public class CollEct02 {
	public static void main(String[] args) {
		
		List list = new ArrayList();//List와 이를 구현한 컬렉션 클래스 ArrayList는 jdk1.2에서 추가됨
		
		list.add("서울시");
		list.add("부산시");//add()메서드로 Object타입으로 업캐스팅해서 저장됨
		list.add(100);//오토박싱+업캐스팅
		list.add(100.6);
		list.add(true);
		list.add("서울시");
		
		System.out.println("컬렉션 원소개수:"+ list.size());
		
		//일반for반복문으로 배열원소값 출력
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i)+"\t");//get()메서드로 원소값을 가져옴. \t키는 탭키만큼 수평으로 띄움
		}
		
		
	}

}
