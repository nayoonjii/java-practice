
public class ObjectEx21 {
	public static void main(String[] args) {
      int[] x= {10};
      System.out.println("main() : x="+x[0]);
      
      change(x);
      System.out.println("main()에서 change()메서드 호출후 x[0] : "+ x[0]);//100 =>주소값을 공유하기 때문이다.
	}
	
	static void change(int[] x) {//참조타입 배열 매개변수
		x[0]=100;
		System.out.println("change(): x[0] = "+x[0]);//100
	}
}
