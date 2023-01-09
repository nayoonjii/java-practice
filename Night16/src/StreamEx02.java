import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* 이클립스 개발툴에서 유사명령어 자동목록 대화상자를 띄우는 단축키는 ctrl+space이다. 이단축키를 사용하면 
 * 모든 명령어를 다 입력할 필요가 없고, 명령어를 잘 몰라도 원하는 명령어 목록에서 선택가능하다. 
 */
public class StreamEx02 {
	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
				new Student("홍길동",100),
				new Student("이순신",80)
				);
		Stream<Student> stream = list.stream();
		stream.forEach(s->{
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name+" : "+score);
		});
	}
}
