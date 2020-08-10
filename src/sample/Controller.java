package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Button button;
    public Label label1;

    public void changeText(){
        label1.setText("this text is changed");
    }
}
