module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    opens part6 to javafx.fxml;
    exports part6;// to javafx.graphics;
    opens combo to javafx.fxml;
    exports  combo;
    opens treeView to javafx.fxml;
    exports treeView;
    opens filechooser to javafx.fxml;
    exports filechooser;
    opens javafx_properties to javafx.fxml;
    exports javafx_properties;
    opens slider to javafx.fxml;
    exports slider;
    opens menubar to javafx.fxml;
    exports menubar;
    opens checkbox to javafx.fxml;
    exports checkbox;
    opens radiobutton to javafx.fxml;
    exports radiobutton;
    opens tableview to javafx.fxml;
    exports tableview;
    opens datepicker to javafx.fxml;
    exports datepicker;
    opens webview to javafx.fxml;
    exports webview;
    opens piechart to javafx.fxml;
    exports piechart;
    opens linechart to javafx.fxml;
    exports linechart;
    opens calculator to javafx.fxml;
    exports calculator;
    opens login to javafx.fxml;
    exports login;
}