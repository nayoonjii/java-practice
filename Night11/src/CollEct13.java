import java.util.ArrayList;
import java.util.List;
//제네릭 타입간의 형변환은 허용하지 않는다. => 제네릭타입이 나온이유에 대해서 알아야한다.(불필요한 업/다운 캐스팅을 하지 않기위해서)
public class CollEct13 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();//문자열만 저장가능
		
		list.add("park");
		list.add("choe");
		list.add("lee");
		
		List<Object> objlist;
		objlist = list;
		
	}

}
