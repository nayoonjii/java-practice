import com.naver.model.ShapeClass;
import com.naver.model2.Circ;
import com.naver.model2.Rect;
import com.naver.model2.Tria;

class Abs18{
	void pr(Circ c) {
		c.draw();
	}
	
	void pr(Rect r) {
		r.draw();
	}
	
	void pr(Tria t) {
		t.draw();
	}//자손타입으로 매개변수를 선언하면 자손 개수 만큼 메서드를 오버로딩해야 한다. 그만큼 불필요하게 코드라인이 길어진다.
}

public class AbsEx18 {
	static void p(ShapeClass ref) {//매개변수 다형성=>업캐스팅 +상속: ShapeClass ref = c; =>업캐스팅
		//ShapeClass 의 모든 자손타입을 받을 수 있다. 그만큼 코드라인이 줄어든다.
		ref.draw();//업캐스팅 이후에 오버라이딩 한 메서드를 호출
	}
	public static void main(String[] args) {

		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();
		
		p(c); p(r); p(t);
		
		System.out.println("====================>");
		
		Abs18 abs = new Abs18();
		abs.pr(new Circ()); abs.pr(new Rect()); abs.pr(new Tria());
		
	}

}//AbsEx18 class
