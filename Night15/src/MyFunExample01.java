/* 매개 인자값이 없고, 리턴값이 없는 람다식 실습 
 */
public class MyFunExample01 {
	public static void main(String[] args) {

		MyFunctionalinterface fi;
		fi = () ->{//method() 추상메서드가 오버라이딩이 되어있다.
			String str = "첫번째 람다식";
			System.out.println(str);
		};
		fi.method();
		
		fi = () ->{System.out.println("두번째 람다식");};
		fi.method();
		
		fi = () ->System.out.println("세번째 람다식");//실행문장이 하나라면 중괄호{} 생략가능
		fi.method();
	}
}
