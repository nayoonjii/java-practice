import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/* java.io입출력 api를 사용해서 원본이미지의 천연색까지
 * 복사되어지는 이미지를 만드는 소스
 */
public class IoCopyImage {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원본이미지 파일명(./images/rain.jpeg>>)");
		String inputFileName = scan.nextLine();
		
		System.out.println("복사되어지는 파일명(./images/rain_copy.jpg>>)");
		String copyFileName = scan.nextLine();
		
		try(InputStream inputStream = new FileInputStream(inputFileName);
				OutputStream outputStream = new FileOutputStream(copyFileName)){
			/* 자바 7이후부터는 AutoCloseable 인터페이스를 구현 상속받은 자손은try()내에서 객체를
			 * 생성하면 finally문에서 명시적으로 닫지않아도 자동으로 닫힌다
			 */
			int data;
			while((data = inputStream.read()) != -1) {
				outputStream.write((char)data);//주어진 파일에 기록
			}//while
		}
		System.out.println(inputFileName+"을"+copyFileName+"으로 복사하였습니다.");		
	}
}
