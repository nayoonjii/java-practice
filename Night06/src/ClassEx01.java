public class ClassEx01 {
	public static void main(String[] args) {
      ClassEx01 ce=new ClassEx01();
      
      int result=ce.add(10,5);
      System.out.println("10+5 = "+result);//15
      
      int[] result2= {0};
      ce.add(3,5, result2);
      System.out.println("변경된 첫번째 배열원소값 ="+result2[0]);//8
	}//main()
	
	int add(int a,int b) {
		return a+b;
	}
	
	void add(int a,int b,int[] result) {
		result[0]=a+b;
	}//전달인자 즉 매개변수 개수를 다르게 한 메서드 오버로딩
}
