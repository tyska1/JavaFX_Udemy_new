package filechooser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

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
        //File selectedFile = fc.showOpenDialog(null); <- selekcja pojedynczego pliku
        List<File> selectedFiles = fc.showOpenMultipleDialog(null);
        if(selectedFiles != null){
            for(int x=0; x<selectedFiles.size(); x++){
                listview.getItems().add(selectedFiles.get(x).getAbsolutePath());
            }
        }
        else{
            System.out.println("File does not exist");
        }
    }


}
