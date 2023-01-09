import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Ex001 {
	public static void main(String[] args) {
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		list.add((int)(Math.random()*10+1));
					
		sum = 0;
		for(int i:list) {
			sum+=i;
		}System.out.println("컬렉션 원소 누적합 = "+sum);
	}
}
