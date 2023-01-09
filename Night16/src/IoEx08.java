import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//FildReader 클래스는 주어진 파일의 내용을 문자단위로 읽어들인다.
public class IoEx08 {
	public static void main(String[] args) {
		String fileName;
		String buf;
		
		Reader myIn = new InputStreamReader(System.in);
		//System.in은 키보드 입력장치와 연결됨. InputStreamReader 는 읽어들인 바이트 문자로 변환
		//업캐스팅하면서 myIn을 생성
		BufferedReader keyBr = new BufferedReader(myIn);
		//ByfferedReader는 읽어들인 문자를 버퍼링해서 효율적으로 읽어들임
		 try {
			 System.out.println("파일명 입력: ./src/IoEx08.java>>");
			 fileName = keyBr.readLine();
			 FileReader fr = new FileReader(fileName);
			 BufferedReader fileBr = new BufferedReader(fr);
			 
			 while((buf = fileBr.readLine()) != null) {
				 //readLine()메서드는 한줄끝까지 읽어들임. 더이상 읽을 값이 없다면 null
				 System.out.println(buf);
			 }
			 fileBr.close(); fr.close(); 
		 }catch(IOException ie) {
			 ie.printStackTrace();
		 }
		
		
	}
}
