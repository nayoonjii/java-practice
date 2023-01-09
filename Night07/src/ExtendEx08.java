class Point8D{
	protected int x = 10;
	protected int y = 20;
	
	/*생성자가 오버로딩 되면 묵시적인 기본생성자를 제공하지 않는다
	 */
	
	public Point8D(int x, int y) {
		this.x = x;
		this.y = y;
		
	}//생성자 오버로딩
}

class Child08 extends Point8D{
	
	protected int z =30;
	
	public Child08() {
		super();//부모클래스 생성자 오버로딩이 되어져서 기본생성자 묵시적으로 제공하지 않아서 오류가발생
		
	}
	
	public void pr() {
		System.out.println("x = "+x+", y = "+y+", z = "+z);
	}
}
public class ExtendEx08 {

	public static void main(String[] args) {

		Child08 child08 = new Child08();
		child08.pr();
	}

}
