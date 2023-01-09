import javax.print.attribute.IntegerSyntax;
/*전달인자 개수가 다른 메서드가 오버로딩 된 경우에는 그 개수만큼 메서드를 정의하면 비효율적. 
이것을 자바 5버전에서 가변인자 문법을 추가해서 메서드를 한번만 정의해도 처리할 수 있음. 이 가변인자 문법을 추가한 메서드를 작성 */
class Mt13{
void p(int ... arr) {
	/* 자바 5버전에서 추가된 가변인자 문법 형식)
	 * 1.매개변수 개수가 다른 메서드가 오버로딩이 된경우는 그 개수만큼 동일메서드명을 오버로딩 시켜야 한다.그만큼 코드 라인이
	 * 길어진다. 이런 불편을 해결하기 위해서 자바 5부터는 가변인자 문법이 추가되었다. int ... arr이 가변인자 문법이다.
	 * 
	 * 2.int ... arr가변인자는 인자 개수만큼 배열로 받아서 처리한다.
	 */
	for(int i = 0; i<arr.length; i++) {
		System.out.print(" "+arr[i]);
	}
	System.out.println();//줄바꿈=>개행
}
}
public class Test4 {
	public static void main(String[] args) {

		
		Mt13 m=new Mt13();
		m.p(10);
		m.p(10,20);
		m.p(1,2,3,5,6,7,9);
	}
}

