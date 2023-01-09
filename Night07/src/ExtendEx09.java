class Point9D{
	int x = 10;
	int y = 20;
	
	Point9D(){}
	
	Point9D(int x, int y){
			this.x = x;
			this.y = y;
		}//생성자 오버로딩
}

class Point9D_1 extends Point9D{
	int z=30;
	
	Point9D_1(){
		super(1000,2000);//부모클래스 Point9D 오버로딩 된 생성자를 호출한다
	}
	
	Point9D_1(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	void print() {
		System.out.println("x = "+x+", y = "+this.y+", z = "+z);
	}//사용자 정의 메서드
}
public class ExtendEx09 {

	public static void main(String[] args) {
		/*문제)기본생성자를 호출하는 p01객체를 생성해서 1000,2000,30을 출력되게하고,
		 * 자손에 전달인자 3개짜리 오버로딩 된 생성자를 호출해서
		 * 100,200,300 이 출력되게 해 본다. 이떄는 p02를 객체를 생성되게 한다.
		 */
		
		Point9D_1 p01 = new Point9D_1();
		p01.print();
		
		Point9D_1 p02 = new Point9D_1(100,200,300);
		p02.print();

	}

}
