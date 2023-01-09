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

