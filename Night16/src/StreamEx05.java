import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//배열로 부터 스트림 얻기
public class StreamEx05 {
	public static void main(String[] args) {
		String[] strArray = {"홍길동","이순신","신사임당"};
		Stream<String> strStream = Arrays.stream(strArray);//배열로 부터 문자열 객체 
		//타입 요소를 처리하는 스트림 생성
		strStream.forEach(s -> System.out.println(" "+s));
		System.out.println("\n\n ================= \n");
		
		int[] intArray = {10,20,30,40,50};
		IntStream intStream = Arrays.stream(intArray);//배여로부터 기본int타입 요소를
		//처리하는 스트림생성
		intStream.forEach(number-> System.out.println(" "+number));
		System.out.println("\n\n====================\n");
	}
}
