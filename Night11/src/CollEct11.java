import java.util.Enumeration;
import java.util.Hashtable;

//키, 값 쌍으로 저장하는 맵 사전적이 자료구조에 제네릭 타입을 지정해본다.
public class CollEct11 {
	public static void main(String[] args) {
		
		Hashtable<String,String> ht = new Hashtable<>();//키,값을 문자열로만 저장가능한 제네릭 타입을 지정
		
		ht.put("seoul","서울시");
		ht.put("busan","부산");
		ht.put("suwon","수원시");
		
		String cityName = ht.get("busan");//busan키에 대한 값을 구함
		if(cityName != null) {
			System.out.println("busan : "+cityName);
		}
		
		Enumeration<String> enu2 = ht.keys();
		
		while(enu2.hasMoreElements()) {//키요소가 있다면
			String k = enu2.nextElement();//키값을 구함
			String v = ht.get(k);//키에대한 값을 구함
			System.out.println(k+" "+v);//키, 값 쌍으로 출력
		}
		
	}

}
