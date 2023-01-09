class GuGuDan{
	
	void guguDan() {
		int k=2;
		while(k<=9) {
			System.out.print(k+"단\t");
			k++;
		}
		System.out.println("\n=============================================================");
		
		for(int j=1;j<=9;j++) {
			for(int i=2;i<=9;i++) {
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
			System.out.println();//줄바꿈=>개행
		}
	}//guguDan()
}
public class ObjectEx08 {
	public static void main(String[] args) {

		GuGuDan gu=new GuGuDan();
		gu.guguDan();		
		
		
/* 평가문제)다음과 같은 출력물이 나오도록 GuGuDan클래스와 guguDan()메서드를 만들어 본다.
 * 		출력물)  2단     3단    4단 ... 9단
 *             ======================
 *             2x1=2  중략..
 *             ...
 *             ...              9x9=81
 *             
 *      구구단 제목은 while반복문을 사용하고,구구단 내용은 이중 for반복문을 사용한다. OOP프로그래밍을 
 *      완성해 보자.       
 */
		
		
	}
}
