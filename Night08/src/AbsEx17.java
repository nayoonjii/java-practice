import com.naver.model.ShapeClass;
import com.naver.model2.Circ;
import com.naver.model2.Rect;
import com.naver.model2.Tria;

/*추상클래스는 new 연산 키워드로 객체생성을 못하지만 객체배열은 생성가능하다. 
 */
public class AbsEx17 {

	public static void main(String[] args) {
		
		ShapeClass[] arr = new ShapeClass[3];//배열크기가 3인 arr객체 배열을 생성
		arr[0] = new Circ();//첫번째 배열 원소에 첫번째 자손 객체주소를 저장하면서 초기화
		arr[1] = new Rect();//조상타입으로 업캐스팅
		arr[2] = new Tria();
		
		for(int i = 0; i<arr.length; i++) {
			arr[i].draw();//업캐스팅 이후 오버라이딩 한 메서드 호출
		}

	}

}
