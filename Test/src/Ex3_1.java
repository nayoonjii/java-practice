/*3번 문제) 다음 코드에서 발생된 예외오류를 처리할 수 있는 코드를  완성


    자바소스)
         public class Ex3_1 {
	public static void main(String[] args) {
                   int a=10, b01=2, b02=0,result=0;
                   result=a/b01;
                  System.out.println(result);
                   result=a/b02;
                  System.out.println(result);
	}//main()
 }
 
  */

 public class Ex3_1 {
	public static void main(String[] args) {
		int a=10, b01=2, b02=0,result=0;
		try {
			result=a/b01;
            System.out.println(result);
             result=a/b02;
            System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
                   
                   
	}//main()
 }

