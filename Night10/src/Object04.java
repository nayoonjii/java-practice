/* Object 의 equals()메서드를 자손에서 오버라이딩을 하여 자손에서 추가한 값만 같다/다르다를 비교 해본다.
 * 결국 Object의 equals()메서드를 상속받아서 사용하면 주소값을 비교하기 때문에 값이 같은 경우 엉뚱한 결과값이 반환된다. 
 */
class Point04 extends Object{
	int x,y;
	
	public Point04() {}
	
	public Point04(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Point04 pt = (Point04)obj;//명시적인 다운캐스팅
		
		if((x==pt.x)&&(y==pt.y)) {//값만 비교해서 같으면 참 다르면 거짓
			return true;
		}else {
			return false;
		}//if else
	}//equals()
	
}

public class Object04 {
	public static void main(String[] args) {
		Point04 pt01 = new Point04(10,20);//오버로딩된 생성자 호출
		Point04 pt02 = new Point04(10,20);//pt01과 pt02는 객체 주소가 다르다.
		
		if(pt01 == pt02) {//객체주소가 달라서 거짓
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}//if else
		
		if(pt01.equals(pt02)) {//객체주소값 비교가 아니고 값만 비교해서 같으면 참 다르면 거짓 =>제대로된 비교를 할수있다.
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
	}

}
