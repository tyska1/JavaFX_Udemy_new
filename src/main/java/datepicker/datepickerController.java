package datepicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class datepickerController {
    @FXML private DatePicker db;
    @FXML private Label myLabel;

    public void displayDate(ActionEvent event){
        LocalDate date = db.getValue();
        myLabel.setText(date.toString());
    }
}
