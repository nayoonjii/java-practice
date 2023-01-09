import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiEchoServer {
	ServerSocket server;//서버 측에서 사용자 접속을 기다리기 위해서 필요한 클래스
	static final int PORT=5000;//포트번호 지정
	Socket child;//사용자 통신하기 위해서 필요한 소켓
	
	public MultiEchoServer() {
		try {
			server=new ServerSocket(PORT);
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(0);//정상적인 프로그램 종료
		}
		
		System.out.println(">>채팅서버<<");
		System.out.println("서버는 사용자 접속 요청을 기다리고 있습니다.");
		
		while(true) {
			try {
				child=server.accept();//사용자 접속이 이루어지면 서버상의 소켓이 생성
				
				//스레드 적용
				MultiThread rth=new MultiThread(child);
				Thread th=new Thread(rth);
				th.start();//쓰레드 시작
				
			}catch(Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}//while end
	}//생성자
	
	public static void main(String[] args) {
      new MultiEchoServer();
	} 
}//MultiEchoServer class

//다중 사용자 접속을 받기 위한 멀티스레드
class MultiThread implements Runnable{
    Socket child;//클라이언트와 통신하기 위한 소켓
    
    InputStream is;
    ObjectInputStream ois;//입력스트림
    
    OutputStream os;
    ObjectOutputStream oos;//출력스트림
    
    String receiveData;//사용자가 보낸 자료를 저장할 변수
    
    public MultiThread(Socket child) {
    	this.child=child;
    	
    	try {
    		System.out.println(child.getInetAddress()+"로 부터 연결요청 받음.");
    		//사용자 ip주소를 얻어와서 서버상에 출력한다.
    		
    		is=child.getInputStream();
    		ois=new ObjectInputStream(is);
    		
    		os=child.getOutputStream();
    		oos=new ObjectOutputStream(os);
    	}catch(IOException ie) {
    		ie.printStackTrace();
    	}
    }
	@Override
	public void run() {
		try {
			while(true) {
				receiveData=(String)ois.readObject();
			System.out.println(child.getInetAddress()+"의 메시지 :"+receiveData);
			oos.writeObject(receiveData);
			oos.flush();//출력스트림을 비움
			}
		}catch(Exception e) {
			System.out.println("클라이언트 강제 종료~");
		}finally {
			try {
				is.close(); ois.close(); os.close(); oos.close();
				child.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}//스레드 문장 구현	
}












