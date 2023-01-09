import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

//내장함수형 인터페이스를 사용한 실습예제
public class ConsumerExample {
	public static void main(String[] args) {

		//매개값은 있고, 리턴값이 없는 실습예)
		Consumer<String> consumer = t-> System.out.println(t+"8");
		consumer.accept("java");
		
		//인자값이 2개이고, 리턴값이 없는 실습예)
		BiConsumer<String,String> bigConsumer = (t,u) -> System.out.println(t+u);
		bigConsumer.accept("Java","8");
		
		//실수인자값이 하나이고, 리턴값이 없는 실습예)
		DoubleConsumer doubleConsumer = d -> System.out.println("Java"+d);
		doubleConsumer.accept(8.0);
		
		//인자값이 2개이고 반환값이 없다.
		ObjIntConsumer<String> objIntConsumer = (t,i) -> System.out.println(t+i);
		objIntConsumer.accept("Java", 8);
	}
}
