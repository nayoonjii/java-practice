/* ArrayIndexOutOfBoundsException 예외오류 특징)
 * 배열주소 인덱스 주소 범위를 벗어나서 발생한 예외오류 
 */
public class Except05 {
	public static void main(String[] args) {
		
		int[] numArr = {10,20,30};//배열크기가 3인 numArr배열생성
		
		try {
			System.out.println("Test -1");
			numArr[3] = 60;//없는 배열주소 인덱스 번호에 접근할려다가 예외 오류가 발생
			System.out.println("Test -2");//이문장을 실행 안함
		}catch(Exception e) {
			e.printStackTrace();//예외족적을 남김
		}
	}
}
