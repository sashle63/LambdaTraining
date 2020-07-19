package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

//Module 293 - example 1
//public class Controller {
//    @FXML
//    private Button clickMeButton;
//
//    public void initialize () {
//        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("You clicked me!");
//            }
//        });
//    }
//}

////Module 293 - example 2
//public class Controller {
//    @FXML
//    private Button clickMeButton;
//
//    public void initialize () {
//        clickMeButton.setOnAction(event -> System.out.println("Tou clicked me!"));
//    }
//}

//Module 293 - example 2
public class Controller {
    @FXML
    private Button clickMeButton;

    public void initialize () {
        clickMeButton.setOnAction(event -> System.out.println("Tou clicked me!"));
    }
}
