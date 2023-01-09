import java.util.function.BiFunction;
import java.util.function.Function;

//생성자 참조 실습
public class ConsExample {
	public static void main(String[] args) {
		
		Function<Integer,Member2> function01 = Member2::new;//생성자 참조
		Member2 member01 = function01.apply(10);//Integer타입을 Memver2타입으로 변환
		//함수형 인터페이스의 추상메서드와 동일한 매개변수 타입과 개수를 가진 생성자를 찾아서 호출
		
		BiFunction<String,Integer,Member2> function02 = Member2::new;
		Member2 member02 = function02.apply("홍길동", 20);//String과 Integer타입을 
		//입력받아서 Member2타입으로 변환
	}
}
