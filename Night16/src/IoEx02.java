import java.io.OutputStream;

/* 바이트 출력스트림 최상위 추상클래스 OutputStream대한예 
 */
public class IoEx02 {
	public static void main(String[] args) throws Exception {

		int data = 0;
		System.out.print("문자입력>>");
		OutputStream myOut = System.out;
		/* 1.System.out은 모니터 출력장치와 연결됨. 
		 */
		
		while((data = System.in.read()) != -1) {
			myOut.write((char)data);
		}
	}
}
