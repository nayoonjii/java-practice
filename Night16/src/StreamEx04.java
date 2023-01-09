import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx04 {

	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
				new Student("홍길동",10),
				new Student("이순신",20),
				new Student("강감찬",30)
			);
		Stream<Student> stream = studentList.stream();
		stream.forEach(s -> System.out.println(s.getName()));
		
		Stream<Student> stream2 = studentList.stream();
		stream2.forEach(s -> System.out.println(s.getScore()));

	}

}
