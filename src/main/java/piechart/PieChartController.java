package piechart;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class PieChartController {
    @FXML private PieChart myPie;
    //@FXML private Button btn1;

    @FXML private Label myLabel;

    public void btn1(ActionEvent event){
        ObservableList<PieChart.Data> list = FXCollections.observableArrayList(
                new PieChart.Data("Programmer", 50),
                new PieChart.Data("Mechanic", 20),
                new PieChart.Data("Farmer", 30)
        );
        myPie.setData(list);

        for(final PieChart.Data data: myPie.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    myLabel.setText(String.valueOf(data.getPieValue()) + "%");
                }
            });
        }
    }

}
