import java.util.Scanner;

public class OprEx20 {
	public static void main(String[] args) {
       
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" *");
			}
			System.out.println();//줄바꿈
		}
		
		System.out.println("\n===============>");
		
		for(int a=2;a<=9;a++) {
			System.out.println(a+"단");
			System.out.println("================>");
			for(int b=1;b<=9;b++) {
				System.out.printf("%d x %d = %d\n",a,b,a*b);
			}
			System.out.println("\n===========>");
		}
	}
}
