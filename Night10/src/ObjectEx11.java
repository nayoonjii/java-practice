/* Object클래스의 equals()메서드를 상속받아서 사용
 * 내용을 비교하지 않고 객체주소값을 비교하는 잘못된 한 예
 */
class Value11 extends Object{//extends Object생략 가능
	int value;
	
	Value11(){}
	
	Value11(int value){
		this.value = value;
	}//생성자 오버로딩
}
public class ObjectEx11 {

	public static void main(String[] args) {
		
		Value11 v01 = new Value11(10);
		Value11 v02 = new Value11(10);//v01과v02값 객체주소는 다르다
		
		if(v01.equals(v02)) {//equals()메서드를 object으로 상속받아서 사용한다. 주소값을 비교
			System.out.println("v01과 v02는 같다.");
			}else {
				System.out.println("v01과v02는 다르다.");
			}//if else
		v02 = v01;//v02에 v01객체주소를 대입함. 그러므로 v02도 v01 객체주소를 가리킴
		
		if(v01.equals(v02)) {//객체주소가 같다.
			System.out.println("v01과v02는 같다.");
		}else {
			System.out.println("v01과 v02는 다르다.");
		}//if else
		
		
	}

}
