import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Fx03 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root3.xml"));
		//xml파일로드
		Scene scene = new Scene(root);//장면객체 생성
		
		stage.setTitle("XML 레이아웃 연습");//무대 윈도우 제목설정
		stage.setScene(scene);//무대위에 장면 설정
		stage.show();//무대윈도우 보여주기
	}

	public static void main(String[] args) {
		launch(args);//start()ㅁㅔ서드 호출

	}

}
