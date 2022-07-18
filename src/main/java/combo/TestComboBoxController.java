package combo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.collections.*;

import java.net.URL;
import java.util.ResourceBundle;

public class TestComboBoxController implements Initializable {
    @FXML
    public ComboBox<String> mycombobox;
    @FXML
    public Label myLabel;
    @FXML
    public Button btn1;
    @FXML
    public ListView<String> myListView;

    ObservableList<String> list = FXCollections.observableArrayList("Mango", "Apple", "Orange", "Cashew", "PawPaw");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //mycombobox.setItems(list); //do listy recznej wykomentowane, a potem po coś wykomentował
        //myListView.setItems(list);
    }

    public void comboChanged(ActionEvent event){
        myLabel.setText(mycombobox.getValue());
    }

    public void buttonCombo(ActionEvent event){
        //mycombobox.getItems().addAll("Car", "House", "School", "Juice");
        //myListView.getItems().addAll("Car", "House", "School", "Juice");
        //wyświetlenie elementów listy w konsoli
        ObservableList<String> names;
        names = myListView.getSelectionModel().getSelectedItems();
        for(String name : names){
            System.out.println(name);
        }
    }
}
