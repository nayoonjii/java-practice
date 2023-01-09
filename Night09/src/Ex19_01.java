import net.daum.model.ShapeClass;
import net.daum.model12.Circ;
import net.daum.model12.Rect;
import net.daum.model12.Tria;


public class Ex19_01 {
	public static void main(String[] args) {
		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();
		
		c.draw();
		r.draw();
		t.draw();
		
		
		ShapeClass ref;
		ref = new Circ();
		ref.draw();
		
		ref = new Rect();
		ref.draw();
		
		ref = new Tria();
		ref.draw();
		
		System.out.println("================");
		
		ShapeClass [] arrDraw = new ShapeClass [3];
		arrDraw[0] = new Circ();
		arrDraw[1] = new Rect();
		arrDraw[2] = new Tria();
		
		for(int i =0; i<arrDraw.length;i++) {
			arrDraw[i].draw();
		}
		
		pr(new Circ());
		pr(new Rect());
		pr(new Tria());
	}
	
	static void pr(ShapeClass sc) {
		sc.draw();
	}

}
