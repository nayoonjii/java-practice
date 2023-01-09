import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


//객체 직렬화로 만들어진 Customer를 활용해서 객체 단위로 데이터 기록하기 
public class IoEx09 {
	public static void main(String[] args) {

		Customer cus = new Customer(7,"홍길동",29,175);
		try {
			System.out.println(cus);//.toSting()메서드 호출
			FileOutputStream fos = new FileOutputStream("./src/iotest03.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cus);//객체단위로 기록
			
			oos.close(); fos.close();
		}catch(IOException ie) {
			ie.printStackTrace();
		}//try~catch문
	}
}
