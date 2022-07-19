package tableview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class tableviewController implements Initializable {

    @FXML private TableView<Employee> table;
    @FXML private TableColumn<Employee, Integer> id;
    @FXML private TableColumn<Employee, String> firstname;
    @FXML private TableColumn<Employee, String> lastname;
    @FXML private TableColumn<Employee, Integer> age;

    public ObservableList<Employee> list = FXCollections.observableArrayList(
            new Employee(1, "Ola", "Tola", 30),
            new Employee(2, "A", "Tola", 35),
            new Employee(3, "B", "Tola", 44),
            new Employee(4, "C", "Tola", 22),
            new Employee(5, "D", "Tola", 39),
            new Employee(6, "E", "Tola", 34),
            new Employee(7, "F", "Tola", 11),
            new Employee(8, "G", "Tola", 98),
            new Employee(9, "H", "Tola", 54),
            new Employee(10, "I", "Tola", 35)
    );
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("id"));
        firstname.setCellValueFactory(new PropertyValueFactory<Employee, String>("firstname"));
        lastname.setCellValueFactory(new PropertyValueFactory<Employee, String>("lastname"));
        age.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("age"));
        table.setItems(list);
    }
}
