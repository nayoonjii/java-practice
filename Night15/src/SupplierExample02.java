import java.util.function.IntSupplier;

//인자값이 없고, 리턴값이 있는 내장함수형 인터페이스 실습)
public class SupplierExample02 {
	public static void main(String[] args) {

		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random()*6)+1;// 1~6사이 정해지지않은 정수숫자 난수를 발생
			return num;
		};
		int numBer = intSupplier.getAsInt();
		System.out.println("주사위 눈의 수 = "+numBer);
	}
}