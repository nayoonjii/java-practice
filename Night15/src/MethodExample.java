import java.util.function.IntBinaryOperator;

//람다식 코드를 더 간결하게 줄인 메서드 참조 실습
public class MethodExample {
	public static void main(String[] args) {

		IntBinaryOperator operator;//2개의 인자값을 받아서 연산한 다음 동일한 타입의 결과값으로 반환
		
		operator = (x,y) -> Calculator.staticMethod(x, y);
		System.out.println("결과 1 : "+operator.applyAsInt(10, 20));//30
		// 정적메서드 참조
		operator = Calculator :: staticMethod;
		System.out.println("결과 2 : "+operator.applyAsInt(30, 40));
		
		Calculator obj = new Calculator();
		operator = (x,y) -> obj.instanceMethod(x, y);
		System.out.println("결과 3 : "+operator.applyAsInt(5, 5));
		
		//인스턴스 메서드 참조
		operator = obj :: instanceMethod;
		System.out.println("결과 3 : "+operator.applyAsInt(7, 7));
	}
}
