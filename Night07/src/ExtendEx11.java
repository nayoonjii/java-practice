class Point11{
	int x;
	int y;
	
	Point11(int x, int y){
		this.x = x;
		this.y = y;
	}//생성자가 오버로딩되면 기본 생성자를 묵시적 제공하지 않는다.
	
	String getLocation() {
		return "x좌표:"+x+", y좌표:"+y;
	}
}

class Point11_1 extends Point11{
	int z;
	
	Point11_1(int x, int y, int z){
		//super();가 생략됨. 부모의 묵시적으로 제공하지 않는 기본생성자를 호출할려다가 에러가 발생
		super(x,y);
		this.z = z;
		
	}

	@Override
	String getLocation() {
		return super.getLocation()+", z좌표:"+z;
		
	}
}
public class ExtendEx11 {

	public static void main(String[] args) {

		Point11_1 pt = new Point11_1(10,20,30);
		/*문제)자손의 Point11_1 생성자에서 super()를 사용해서 부모의 오버로딩 된 생성자를 호출해서 x,y변수값을 초기화하고
		 * getLocation()메서드를 오버라이딩하여 x,y,z 좌표값 10,20,30을 출력되게 해보자 
		 */
		System.out.println(pt.getLocation());
		
	}

}
