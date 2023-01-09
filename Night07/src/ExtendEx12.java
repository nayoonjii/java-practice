class Point12{
	int x = 10;
	int y = 20;
	
	Point12(int x,int y){
		this.x = x;
		this.y = y;
	}//전달인자 개수가 다른 생성자 오버로딩
	
}

class Point12D_1 extends Point12{
	int z = 30;
	
	Point12D_1(){
		this(100,200,300);//같은 클래스 내의 다른 생성자 호출
	}
	
	Point12D_1(int x,int y , int z){
		super(x,y);//부모클래스 오버로딩 된 생성자 호출
		this.z = z;
	}
	
	void pr() {
		System.out.println("x좌표: "+x+", y좌표:"+y+", z좌표:"+z);
	}//사용자 정의 메서드
}

public class ExtendEx12 {

	public static void main(String[] args) {

		Point12D_1 pt = new Point12D_1();
		pt.pr();
		
	}

}
