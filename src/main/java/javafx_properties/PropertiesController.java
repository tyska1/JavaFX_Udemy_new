package javafx_properties;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

import java.net.URL;
import java.util.ResourceBundle;

public class PropertiesController implements Initializable {

    final OurProperty ourPro = new OurProperty();

    @FXML
    private Label myLabel;

    @FXML
    private ProgressBar pb;

    @FXML
    private ProgressIndicator pi;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ourPro.setProperty(0);
        ourPro.propertyProperty().addListener((ChangeListener<Object>) (observableValue, oldValue, newValue) -> myLabel.setText(new Double(ourPro.getProperty()).toString()));
        pb.progressProperty().bind(ourPro.propertyProperty());
        pi.progressProperty().bind(ourPro.propertyProperty());
    }


    public void buttonCLick(ActionEvent event){
        ourPro.setProperty(ourPro.getProperty() + 0.1);
    }

    public void buttonOneCLick(ActionEvent event){
        ourPro.setProperty(ourPro.getProperty() - 0.1);
    }
}
