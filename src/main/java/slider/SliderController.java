package slider;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

public class SliderController implements Initializable {

    @FXML
    private Slider slider;
    @FXML
    private TextField textField;

    private static final double INT_VALUE = 50;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        slider.setValue(INT_VALUE);
        textField.setText(new Double(INT_VALUE).toString());
        textField.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getNumberInstance());
    }
}
