package radiobutton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class radiobuttonController {
    @FXML
    private RadioButton rb1;
    @FXML
    private RadioButton rb2;
    @FXML
    private Label label;

    public void radioAction(ActionEvent event){
        String display = "";
        if(rb1.isSelected()){
            display+= rb1.getText() + "\n";
        }
        if(rb2.isSelected()){
            display+= rb2.getText() + "\n";
        }
        label.setText(display);
    }

}
