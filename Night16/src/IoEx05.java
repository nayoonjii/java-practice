import java.io.FileInputStream;
import java.io.IOException;

//주어진 파일로 부터 바이트 단위로 읽어 들이는 FileInputStream클래스
public class IoEx05 {
	public static void main(String[] args) {
		int data = 0;
		String path = "./src/IoEx05.java";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			while((data = fis.read()) != -1) {
				//read()메서드로 한바이트 씩 읽어들임. 더이상 읽을 값이 없다면 -1
				System.out.write((char)data);//한바이트씩 읽어들인것을 출력
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
