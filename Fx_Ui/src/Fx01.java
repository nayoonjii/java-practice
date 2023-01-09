import javafx.application.Application;
import javafx.stage.Stage;

/* 첫번째로 JAVA Fx로 윈도우창 만들기 실습 
 */
public class Fx01 extends Application {//fx로Ui를 그릴려면 Application추상클래스로 부터 상속을 받는다.

	@Override
	public void start(Stage stage) throws Exception {
		//stage는 연극 무대라고 생각하고 소스이해에 도움된다.
		stage.show();//무대윈도우 보여주기
	}

	public static void main(String[] args) {
		launch(args);//start() 메서드 호출
	}

}
