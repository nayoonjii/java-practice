import java.io.File;
import java.io.IOException;

/* java.io패키지의 File api하위의 메서드에 대한 실습
 * 주로 이 크래스는 자료실 만들때 많이 사용한다. 
 */
public class IoEx12 {
	public static void main(String[] args) throws IOException {

		String path = "./images";
		File dir = new File(path);
		String[] fileList = dir.list();//주어진 경로의 파일 목록을 배열로 반환
		for(String name: fileList) {
			File f = new File(path+"/"+name);
			System.out.println("====================>");
			System.out.println("파일이름: "+f.getName());
			System.out.println("경로: "+f.getPath());
			System.out.println("절대경로: "+ f.getAbsolutePath());
			System.out.println("정규경로: "+f.getCanonicalPath());
			System.out.println("폴더여부: "+f.isDirectory());//디렉토리면 참, 아니면 거짓
			System.out.println("파일여부: "+ f.isFile());//파일이면 참, 아니면 거짓
			
		}
		
	}
}
