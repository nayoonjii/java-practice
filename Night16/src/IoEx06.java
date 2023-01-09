import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 1.주어진 파일에 바이트 단위로 기록 즉 출력하는 FileOutputStream클래스 
 */
public class IoEx06 {
	public static void main(String[] args) {
		
		int data;
		System.out.println("저장할 내용 입력>>");
		try {
			File f = new File("./src/test.txt");
			FileOutputStream fos = new FileOutputStream(f);
			while((data = System.in.read()) != -1) {
				fos.write((char)data);
			}
			fos.close();
		}catch(FileNotFoundException fe) {//해당 파일이 없을때 예외
			System.out.println(fe.getMessage());
		}catch(IOException ie) {
			ie.printStackTrace();//예외족적남김
		}
		

	}
}
