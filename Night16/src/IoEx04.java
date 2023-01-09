import java.io.File;

/* java.io.File클래스는 파일과 디렉토리를 다룬다. 
 */
public class IoEx04 {
	public static void main(String[] args) {
		File dir = new File("./src");//이클립스에서 인식하는 현재 경로 인 상대경로는./는 해당 프로젝트
		//경로인 Night16이 된다.
		String[] fileList = dir.list();//src경로의 파일과 디렉토리 모곡을 배열로 반환
		
		for(String fileName : fileList) {
			System.out.println(fileName);
		}
		
	}
}
