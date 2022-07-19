package treeView;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.w3c.dom.events.MouseEvent;
import javafx.scene.input.*;

import java.net.URL;
import java.util.ResourceBundle;

public class TreeController implements Initializable {
    @FXML
    TreeView<String> treeView;

    Image circle = new Image(String.valueOf(getClass().getResource("dog2.png")));
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        TreeItem<String> root = new TreeItem<>("Root", new ImageView(circle));
        TreeItem<String> node1 = new TreeItem<>("Node 1", new ImageView(circle));
        TreeItem<String> node2 = new TreeItem<>("Node 2", new ImageView(circle));
        TreeItem<String> node3 = new TreeItem<>("Node 3", new ImageView(circle));
        TreeItem<String> node4 = new TreeItem<>("Node 4", new ImageView(circle));
        TreeItem<String> node5 = new TreeItem<>("Node 5", new ImageView(circle));
        root.getChildren().addAll(node1, node2, node3, node4, node5);
        //creating sub-nuts
        TreeItem<String> node1a = new TreeItem<>("Node 1a", new ImageView(circle));
        TreeItem<String> node2a = new TreeItem<>("Node 2a", new ImageView(circle));
        TreeItem<String> node3a = new TreeItem<>("Node 3a", new ImageView(circle));
        TreeItem<String> node4a = new TreeItem<>("Node 4a", new ImageView(circle));
        TreeItem<String> node5a = new TreeItem<>("Node 5a", new ImageView(circle));
        node1.getChildren().addAll(node1a, node2a, node3a, node4a, node5a);

        TreeItem<String> node1b = new TreeItem<>("Node 1b", new ImageView(circle));
        TreeItem<String> node2b = new TreeItem<>("Node 2b", new ImageView(circle));
        TreeItem<String> node3b = new TreeItem<>("Node 3b", new ImageView(circle));
        TreeItem<String> node4b = new TreeItem<>("Node 4b", new ImageView(circle));
        TreeItem<String> node5b = new TreeItem<>("Node 5b", new ImageView(circle));
        node1a.getChildren().addAll(node1b, node2b, node3b, node4b, node5b);
        treeView.setRoot(root);

    }

//    public void mouseClick(MouseEvent mouseEvent){
//        TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
//        System.out.println(item.getValue());
//    }

    public void mouseClick(javafx.scene.input.MouseEvent mouseEvent) {
        if(mouseEvent.getClickCount() == 2) { //jesli klikne podwojnie
            TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
            System.out.println(item.getValue());
        }
    }
}
