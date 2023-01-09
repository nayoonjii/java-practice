import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Fx02 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		VBox root = new VBox();//VBox는 컨트롤(컴포넌트)을 수직으로 배치하는레이아웃(컨테이너)
		root.setPrefWidth(380);//VBox크기 폭
		root.setPrefHeight(150);//VBox높이
		root.setAlignment(Pos.CENTER);//컨트롤 중앙정렬
		root.setSpacing(20);//컨트롤 수직간격
		
		Label label = new Label();
		label.setText("Hello. JAVA FX");//라벨 위에 문자 설정
		label.setFont(new Font(50));//라벨 글자 크기 설정
		
		Button button = new Button();
		button.setText("확인");//버튼위에 출력되는 캡션 문자열
		button.setOnAction(event->Platform.exit());//자바8에서 추가된 람다식 문법(->)으로
												   //확인 버튼을 클릭하면 윈도우창 종료
		root.getChildren().add(label);//자식노드로 레이블 추가
		root.getChildren().add(button);
		
		Scene scene = new Scene(root);//장면객체생성
		
		stage.setTitle("프로그램 FX연습");//무대윈도우 제목설정
		stage.setScene(scene);//무대윈도우에 장면 설정
		stage.show();//무대윈도우 보여주기 
	}

	public static void main(String[] args) {
		launch(args);//start()메서드 호출
	}

}
