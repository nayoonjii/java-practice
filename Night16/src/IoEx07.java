import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* InputStreamReader는 읽어들인 바이트를 문자로 변환
 * BufferedReader는 읽어들인 문자를 버퍼링해서 한줄 끝까지 문자열로 효율적으로 읽어들임. 
 */
public class IoEx07 {
	public static void main(String[] args) {

		String fileName;
		InputStreamReader myIn = new InputStreamReader(System.in);
		BufferedReader keyBr = new BufferedReader(myIn);
		try {
			System.out.print("파일이름 입력>>");
			fileName = keyBr.readLine();//한줄 끝까지 문자열로 읽어들임
			System.out.println(fileName);
			
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally{
			try {
				if(keyBr != null) keyBr.close();
				if(myIn != null) myIn.close();
			}catch(Exception e) {e.printStackTrace();}
		}
	} 
}
