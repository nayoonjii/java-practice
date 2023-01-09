import java.util.Arrays;
import java.util.List;

//스트림을 생성한 다음 점수에 대한 평균을 구해서 실수로 변경
public class StreamEx03 {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동",100),
				new Student("이순신",90),
				new Student("강감찬",100)
			);
		
		double avg = studentList.stream()
				.mapToInt(Student :: getScore)//매개변수 메서드 참조로 학생점수를구함
				.average()//평균을 구함
				.getAsDouble();//구한 평균값을 실수로 변경
		System.out.println("평균점수 = "+avg);
	}
}
