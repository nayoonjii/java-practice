import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* 도메인 명인 사이트 주소를 입력하면 이 주소에 해당하는 컴 ip주소를 반환한다. 이 아이피 주소를 인터넷 주소창에
 * 입력하면 어떤 ip주소로는 띄워지고 어떤 주소는 안띄워진다. 안띄워지는 것은 상대방 서버에서 보안상 막아 놓은 경우
 * 가 많다.
 */
public class NetIpEx01 {
	public static void main(String[] args) throws Exception{

		BufferedReader reader;
		String url=null;
		InetAddress addr=null; //ip주소 번호를 처리할 때 사용하는 클래스이다.자바 프로그램안에서
		//ip번호와 url 주소를 알아내고 싶을때 사용.
		
		reader=new BufferedReader(new InputStreamReader(System.in));
		/* 1.System.in은 키보드 입력장치와 연결됨
		 * 2.InputStreamReader는 읽어들인 바이트를 문자로 변환
		 * 3.BufferedReader는 읽어들인  문자를 버퍼링(임시저장)해서 한꺼번에 효율적으로 읽어들임
		 */
		
		System.out.print("사이트 주소 입력>>");
		url=reader.readLine();//한줄 끝까지 문자열로 읽어들임.
		
		try {
			addr=InetAddress.getByName(url);
		}catch(UnknownHostException ue) {
			ue.printStackTrace();
		}
		
		System.out.println(url+"에 대한 ip번호 : "+addr.getHostAddress());
	}
}









