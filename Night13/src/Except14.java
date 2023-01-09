import java.io.PrintWriter;
import java.util.ArrayList;

/* java7버전 이후부터 AutoCloseable 인터페이스를 구현상속받은 자손은
 * try()내에서 객체를 생성하면 finally문에서 명시적으로 close()즉 닫지 않아도 자동으로 닫힌다. 
 */
public class Except14 {
	public static void main(String[] args) throws Exception {

		ArrayList<String> cityNameList = new ArrayList<>();
		cityNameList.add("seoul");
		cityNameList.add("busan");
		cityNameList.add("incheon");//컬렉션에 원소값추가
		
		try(PrintWriter output = new PrintWriter("./src/io.txt")){
			/* 1. java.io패키지의 PrinWriter는 출력스트림
			 * 2. ./는 현재경로를 뜻하고, 이클립스에서 인식하는 현재 기본경로는 해당 츠로젝트 경로인Night13 
			 */
			for(String cityName:cityNameList) {
				output.println(cityName.toUpperCase());//영문대문자로 변경해서 기록
			}
			
		}
	}

}
