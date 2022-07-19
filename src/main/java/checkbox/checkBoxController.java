package checkbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class checkBoxController {
    @FXML
    private CheckBox checkbox1;
    @FXML
    private CheckBox checkbox2;
    @FXML
    private CheckBox checkbox3;
    @FXML
    private Label myLabelOne;
    @FXML
    private Label myLabelTwo;

    public void checkAction(ActionEvent event){
        String display = "";
        int count = 0;
        if(checkbox1.isSelected()){
            display += checkbox1.getText() + "\n";
            count++;
        }
        if(checkbox2.isSelected()){
            display += checkbox2.getText() + "\n";
            count++;
        }
        if(checkbox3.isSelected()){
            display += checkbox3.getText() + "\n";
            count++;
        }
        myLabelOne.setText("You select item(s) : " + count);
        myLabelTwo.setText(display);
    }

}
