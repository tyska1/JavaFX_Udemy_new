package javafx_properties;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class PropertiesController implements Initializable {

    final OurProperty ourPro = new OurProperty();

    @FXML
    private Label myLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ourPro.setProperty(0);
        ourPro.propertyProperty().addListener(new ChangeListener<Object>() {
            @Override
            public void changed(ObservableValue<?> observableValue, Object oldValue, Object newValue) {
                myLabel.setText(new Double(ourPro.getProperty()).toString());
            }

        });
    }

    public void buttonCLick(ActionEvent event){
        ourPro.setProperty(ourPro.getProperty() - 1);
    }
}
