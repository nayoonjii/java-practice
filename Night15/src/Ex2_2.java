class UserException extends Exception{
	public UserException(String str) {
		super(str);
	}
}
public class Ex2_2 {
	public static void main(String[] args){
     try{
       int a=-10;
       if (a<0) {
    	   throw new UserException("양수가 아닙니다!");
       }
    } catch(UserException e){
     //예외 에러 메시지 출력 코드작성
    	System.out.println(e.getMessage());
   }
}
}

