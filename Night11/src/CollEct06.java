import java.util.Stack;

/* java.util패키지의 컬렉션 Stack클래스 특징)
 *  1. 자바 1에서 추가되었고, 입구와 출구가 같은 자료구조이다. 그러므로 가장 먼저 입력된것이 가장 나중에 나온다.
 *  	즉, First Input Last Output 구조이다. 줄어서FILO구조이다.
 *  
 *  2. 가장 나중에 입력된 것이 가장먼저 나오는 구조이다. Last Input First Output 구조이다. LIFO구조이다.
 */
public class CollEct06 {
	public static void main(String[] args) {
		
		Stack myStack = new Stack();
		
		myStack.push("1-Java");
		myStack.push("2-Java");
		myStack.push("3-Oracle");// 스택의 맨위에 요소값을 추가
		
		
		while(!myStack.isEmpty()) {//스택이 비어있지 않다면
			System.out.println(myStack.pop());//pop()메서드로 스택의 맨위의 원소를 제거하면 값을 반환.
		}//while
		
		
	}

}
