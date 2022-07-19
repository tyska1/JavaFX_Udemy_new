package filechooser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;

public class ChooserController {
    @FXML
    private Button btn1;
    @FXML
    private ListView listview;

    public void buttonAction(ActionEvent event){
        FileChooser fc = new FileChooser();
        //domyślny katalog
        fc.setInitialDirectory(new File("C:\\Users"));
        //adding filter np. png files only *.png, pamiętać, że to stringi
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PDF Files only", "*.pdf"));
        File selectedFile = fc.showOpenDialog(null);
        if(selectedFile != null){
            listview.getItems().add(selectedFile.getName());
        }
        else{
            System.out.println("File does not exist");
        }
    }


}
