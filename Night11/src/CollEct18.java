import java.util.HashMap;
import java.util.Scanner;

/* java.util패키지의 컬렉션 Map 인터페이스를 구현한 HashMap컬렉션 클래스특징)
 * 1. jdk1.2에서 추가되었고, 키값 쌍으로 저장하는 사전적인 자료구조이다.
 * 2. 키를 통해서 값을검색하기 때문에 검색속도가 빠르다.
 * 3. 저장되는 순서는 유지하지 않는다.
 */
public class CollEct18 {
	public static void main(String[] args) {

		HashMap memberMap = new HashMap();
		memberMap.put("aaaa","12345");//키아이디, 값 비번을 동시저장
		memberMap.put("bbbb","56789");
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("id와 password를 입력하세요.");
			System.out.print("id>>");
			String id = scan.nextLine().trim();//매서드 체이닝 방법으로 문자열로 읽어들여서
			//trim()메서드로 양쪽공백을 제거
			System.out.print("password>>");
			String pwd = scan.nextLine().trim();
			System.out.println("\n\n");//\n은 줄바꿈(개행)
			
			
			if(!memberMap.containsKey(id)) {//맵자료구조에 아이디 키가 없다면
				System.out.println("입력하신 아이디는 존재하지않습니다. 다른아이디를 입력하세요");
									//유효성검증 경고메세지(validate)
				continue;//아래문장을 실행하지 않고, 반복문 처음으로 돌아가서 다음 반복을 계속한다.
			}else {
				if(!(memberMap.get(id)).equals(pwd)) {
					//id키에 대한 값 즉 비번을 맵으로 부터 가져와서 입력비번하고 비교해서 다르면
					System.out.println("비번이 다릅니다. 다시입력~");
				}else {
					System.out.println("아이디와 비번이 일치합니다.");
					break;//무한루프 반복문을 종료
				}
			}//if else
			
		}//무한루프문=>조건이 무조건 참이어서 영원히 반복하는 반복문을 뜻한다.
		
	}

}
