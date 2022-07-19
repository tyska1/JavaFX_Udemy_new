package part6;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.Random;

public class MainController {

        @FXML
        private Label myLabel;
        public void generateRandom(ActionEvent event){
            Random random = new Random();
            int rand = random.nextInt(100) + 1;
            //System.out.println(rand);
            myLabel.setText(Integer.toString(rand));
         }
}
