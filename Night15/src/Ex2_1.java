import java.util.ArrayList;
import java.util.List;

public class Ex2_1 {
	public static void main(String[] args) {
         List<String> nameList=new ArrayList<String>();
         nameList.add("seoul");
         nameList.add("busan");

         for(String cityName:nameList){
          System.out.println(cityName.toUpperCase());
         }
   }
}
