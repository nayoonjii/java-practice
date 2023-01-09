import java.util.ArrayList;
import java.util.List;

public class CollEct14 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("apple");//문자열만 저장가능
		list.add("banana");//문자열만 저장가능
		list.add("grape");//문자열만 저장가능
		
		List<? extends Object> objlist;
		/* <? extends Object> 제네릭타입 와일드 카드는 Object을 상속받은 자손만큼은 제네릭 타입간의 형변환을 제한적으로 
		 * 허용하겠다. 
		 */
		
		objlist = list;
		
		for(Object obj:objlist) {
			String temp =(String)obj;//명시적인 다운캐스팅
			System.out.println(temp.toUpperCase()+"\t "+temp);
		}
		
	}

}
