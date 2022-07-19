package webview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class WebviewController implements Initializable {
    @FXML
    private WebView myWebView;
    @FXML
    private WebEngine engine;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        engine = myWebView.getEngine();
    }

    public void btnOne(ActionEvent event){
        engine.load("https://www.google.com");
    }
    public void btnTwo(ActionEvent event){
        engine.executeScript("window.location = \"http://www.gstevewall.com//\";");
    }
    public void btnThree(ActionEvent event){
        engine.loadContent("<html><head>WebView</head><body><h3>Welcome to webview class</h3></body></html>");
    }
    public void btnFour(ActionEvent event){
        engine.reload();
    }
}
