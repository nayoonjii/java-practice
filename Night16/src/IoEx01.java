import java.io.IOException;
import java.io.InputStream;

//바이트 입력스트림의 최상위 추상클래스인 InputStream
public class IoEx01 {
	public static void main(String[] args) {
		int data = 0;
		System.out.println("문자를 입력>>");
		try {
			InputStream myIn = System.in;//키보드 입력장치와 연결됨
			
			while((data = myIn.read()) != -1) {
				//read()메서드로 한바이트 씩 읽어들임. 더 이상 읽을 값이 없다면-1
				System.out.print((char)data);
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
