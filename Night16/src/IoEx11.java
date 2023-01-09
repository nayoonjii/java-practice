import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//주어진 파일 내용을 효율적으로 읽어들인 다음 버퍼링해서 주어진 파일에 효율적으로 기록한다.
public class IoEx11 {
	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;//읽어들인 문자 스트림을 버퍼링해서 효율적으로 읽어들임
		PrintWriter outputStream = null;//출력스트림(문자단위로 기록)
		
		try {
			inputStream = new BufferedReader(new FileReader("./images/a.txt"));
			outputStream = new PrintWriter(new FileWriter("./images/a_copy.txt"));
			
			String result;
			while((result = inputStream.readLine())!=null) {
				outputStream.println(result);//주어진 파일에 기록한다. 즉 출력한다.
			}
		}finally {
			if(inputStream != null)inputStream.close();
			if(outputStream != null)outputStream.close();
		}
	}
}
