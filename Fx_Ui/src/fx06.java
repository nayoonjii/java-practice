import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class fx06 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = (Parent)FXMLLoader.load(getClass().getResource("root4.xml"));
		//xml파일을 읽어들여서 로드시킨다.
		Scene scene = new Scene(root);
		
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		//css파일을 문자열로 읽어들여서 장면에 추가하여 적용
		
		stage.setTitle("외부스타일 css적용");//무대윈도우에 제목설정
		stage.setScene(scene);//무대에 장면 설정
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);//start()메서드 호출

	}

}
