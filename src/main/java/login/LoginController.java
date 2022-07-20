package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;

public class LoginController {
    @FXML
    private Label myLabel;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;

    public void LoginCode(ActionEvent event){
        if(txtUsername.getText().equals("User") && txtPassword.getText().equals("Pass")){
            try { //lub zamiast try catch zrobic throws exception????
            myLabel.setText("Login Successful");
            Stage primaryStage = new Stage();
            Parent root = null;
                root = FXMLLoader.load(getClass().getResource("newPage.fxml"));
                Scene scene = new Scene(root);
                //scene.getStylesheets().add(getClass().getResource("application3.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            myLabel.setText("Incorrect");
        }
    }
}
