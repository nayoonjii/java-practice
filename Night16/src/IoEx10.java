import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//객체직렬화를 통한 객체단위로 읽어오기
public class IoEx10 {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("./src/iotest03.txt");
			//주어진 파일로 부터 바이트 단위로 읽어들임
			ObjectInputStream ois = new ObjectInputStream(fis);
			Customer cus = (Customer)ois.readObject();//객체단위로 읽어옴
			System.out.println("ID \t name \t age \t height");
			System.out.println("===================================>");
			System.out.println(cus);
			ois.close(); fis.close();
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}	
	}
}
