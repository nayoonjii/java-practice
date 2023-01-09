import java.io.InputStream;
import java.io.OutputStream;

/* 바이트 입력 스트림의 최상위 추상클래스 InputStream은 키보드 입력장치인 System.in 과연결됨
 * 바이트 출력 스트림의 최상위 추상클래스 OutputStream은 모니터 출력장치인 System.out과 연결됨
 */
public class IoEx03 {
	public static void main(String[] args) {

		int data = 0;
		InputStream myIn = System.in;
		OutputStream myOut = System.out;
		
		System.out.print("문자입력>>");
		
		try {
			while((data = myIn.read()) !=-1) {
				if(data=='x'||data=='X') {// ||은 논리합 OR 연산자
					break;//반복문 종료
				}
				myOut.write((char)data);//입력받은값을 그대로 출력
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
