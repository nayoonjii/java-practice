package fx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable {

	@FXML private Button btn01;
	@FXML private Button btn02;
	@FXML private Button btn03;
	
	@Override
	public void initialize(URL location, ResourceBundle res) {
		
		btn01.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				handleBtn01Action(event);
			}//첫번째버튼 클릭하면 호출
		});//첫번째버튼 이벤트 등록=익명클래스 문법으로 처리(외부클래스$번호.class):
		//RootController$1.class
		
		btn03.setOnAction(event->handleBtn03Action(event));//람다식 문법으로
		//이벤트 등록
	}//초기화메서드

	public void handleBtn01Action(ActionEvent event) {
		System.out.println("버튼1 클릭");
	}

	public void handleBtn02Action(ActionEvent event) {
		System.out.println("버튼2 클릭");
	}
	
	public void handleBtn03Action(ActionEvent event) {
		System.out.println("버튼3 클릭");
	}
}
