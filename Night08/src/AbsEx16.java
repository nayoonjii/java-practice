import com.naver.model.ShapeClass;
import com.naver.model2.Circ;
import com.naver.model2.Rect;
import com.naver.model2.Tria;

public class AbsEx16 {

	public static void main(String[] args) {

		Circ c = new Circ();
		c.draw();
		
		Rect r = new Rect();
		r.draw();
		
		Tria t = new Tria();
		t.draw();
		
		System.out.println("=====================>");
		
		ShapeClass ref;
		
		ref = new Circ();//업캐스팅
		ref.draw();//업캐스팅이후 오버라이딩 한 메서드 호출
		
		ref = new Rect();
		ref.draw();
		
		ref = new Tria();
		ref.draw();
		
	}

}
