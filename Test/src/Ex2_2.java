import org.omg.CORBA.UserException;

/*
2번 문제) 다음 자바 코드에서 발생된 예외오류를 처리할 수 있는 코드로 Exception 예외 부모 클래스를 상속받아서 사용자 정의 예외 클래스를 정의.

    그래서 예외 에러 메시지로 ‘양수가 아닙니다!’가 출력되게 만들어 봄. 추가 코드를  완성.

   자바 소스)
    //사용자 정의 예외 클래스 코드작성
public class Ex2_2{
    public static void main(String[] args){
     try{
       int a=-10;

       if (a<0){
　　　　　　throw new UserException("양수가 아닙니다!“);
       }
    } catch(UserException e){
     //예외 에러 메시지 출력 코드작성
  
   }
 }
}

    배점 : 50점
 */
class UserException extends Exception{
	public UserException(String str) {
		super(str);
	}
}
public class Ex2_2{
    public static void main(String[] args){
     try{
       int a=-10;
       if (a<0){
    	   throw new UserException("양수가 아닙니다!");
       }
    } catch(UserException e){
     //예외 에러 메시지 출력 코드작성
    	System.out.println(e.getMessage());
  
   }
 }
}



