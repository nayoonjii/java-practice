import java.util.ArrayList;
import java.util.List;
/*
 * 1번 문제)  다음의 자바소스를 보시고 코드에서 잘못 사용된 타입 때문에 발생되는 문제점을 제거하기 위해 무엇을 추가하면 컴파일시 더 강한 타입체크를 하고 불필요한
무엇을 할 필요가 없기 때문에 프로그램 성능이 향상.   추가하고 제거하고 변경할 자바코드를 작성.

   자바소스)
public class Ex2_1 {
    public static void main(String[] args) {
         List nameList=new ArrayList();
         nameList.add("seoul");
         nameList.add("busan");

         for(Object obj:nameList){
          String cityName=(String)obj;//삭제 하고 Object obj를 String cityName으로 변경
          System.out.println(cityName.toUpperCase());
         }
    }
  }
*/

public class Ex2_1 {
    public static void main(String[] args) {
         List<String> nameList=new ArrayList<String>();//제네릭 추가하기
         nameList.add("seoul");
         nameList.add("busan");

         for(String cityName:nameList){
          System.out.println(cityName.toUpperCase());
         }
    }
  }