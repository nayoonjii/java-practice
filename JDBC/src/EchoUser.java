import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoUser {
    Socket client;//서버와 통신하기 위해서 필요한 소켓
    String ip;//서버 아이피
    static final int PORT=5000;//포트번호
    BufferedReader reader;
     
    InputStream is;
    ObjectInputStream ois;//입력스트림
    
    OutputStream os;
    ObjectOutputStream oos;//출력스트림
    
    String sendData;//서버로 보낼 데이터를 저장할 변수
    String receiveData;//서버로 부터 받은 데이터를 저장하기 위한 변수
    
    public EchoUser(String ip) {
    	this.ip=ip;
    	
    	try {
    	    System.out.println(">>클라이언트<<");
    	    client=new Socket(ip,PORT);
    	    
    	    reader=new BufferedReader(new InputStreamReader(System.in));
    	    
    	    os=client.getOutputStream();
    	    oos=new ObjectOutputStream(os);
    	    
    	    is=client.getInputStream();
    	    ois=new ObjectInputStream(is);
    	    
    	    System.out.print("입력>>");
    	    while((sendData=reader.readLine()) != null) {//더 이상 읽을 값이 없다면 null
    	    	oos.writeObject(sendData);//읽어들인 자료를 서버로 보낸다.
    	    	oos.flush();//출력스트림을 비움
    	    	
    	    	if(sendData.equals("exit")) {
    	    		break;//반복문 종료
    	    	}
    	    	receiveData=(String)ois.readObject();//서버가 다시 보낸 메시지를 받아서 저장
    	    	System.out.println(client.getInetAddress()+"로 부터 받은 메시지 : "+
    	    	receiveData);
    	    	System.out.print("입력>>");
    	    }
    	}catch(Exception e) {
    		e.printStackTrace(); 
    		System.exit(0);
    	}finally {
    		try {
    			if(ois != null) ois.close();
    			if(is != null) is.close();
    			if(oos != null) oos.close();
    			if(os != null) os.close();
    			if(reader != null) reader.close();
    			if(client != null) client.close();
    		}catch(Exception e) {e.printStackTrace();}
    	}
    }
	public static void main(String[] args) {
        new EchoUser("192.168.104.120");//채팅서버 ip주소 할당
	}
}









