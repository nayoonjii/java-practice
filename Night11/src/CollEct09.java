import java.util.ArrayList;
import java.util.List;

/* 제네릭 타입 즉 제네릭스 문법이 추가된 이유와 특징)
 *  1. 컬렉션에서 제네릭 타입을 지정하지 않으면 모든 자료형 값을 저장할수 있다. 그러면 원하는 자료 추출도 어렵고, 자료의 안정성도 
 *  	보장되지 않는다. 또한 불필요한 형변환을 하기 때문에 프로그램 실행속도도 떨아진다. 이러한 부분을 해결하기 위해서 자바5 부터는
 *  	<제네릭 타입(자료형)>을 지정하면 지정한 티입만 저장 가능하다. 주의 할 것은 제네릭 타입에서는 기본타입은 안된다.
 */
public class CollEct09 {
	public static void main(String[] args) {
		
		List nameList = new ArrayList();
		
		nameList.add("Hong");//업캐스팅 되어져서 저장
		nameList.add("lee");
		nameList.add("choe");
		
		String temp;
		for(int i = 0;i<nameList.size();i++) {
			temp = (String)nameList.get(i);//명시적인 다운캐스팅
			System.out.println(temp.toUpperCase());//영문 대문자로 출력
		}
		System.out.println("\n========================");
		
		List<String> cityList = new ArrayList<String>();//<String>제네릭 타입을 지정하면 문자열만 저장
		//가능하다.
		
		cityList.add("seoul");
		cityList.add("busan");
		//향상된 확장for반복문(자바5버전)
		for(String cityName:cityList) {//불필요한 형변환을 하지 않아도 된다.
			System.out.print(cityName.toUpperCase()+"\t");
		}
	}
}
