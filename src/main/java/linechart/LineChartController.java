package linechart;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;

public class LineChartController {
    @FXML
    private LineChart<String, Number> myLie;
    @FXML
    private Label myLabel;
    public void btnAction(ActionEvent event){
        myLie.getData().clear();
        XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
        series.getData().add(new XYChart.Data<String, Number>("Monday", 20));
        series.getData().add(new XYChart.Data<String, Number>("B", 31));
        series.getData().add(new XYChart.Data<String, Number>("C", 8));
        series.getData().add(new XYChart.Data<String, Number>("D", 16));
        series.getData().add(new XYChart.Data<String, Number>("E", 9));

     /*   XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
        series1.getData().add(new XYChart.Data<String, Number>("Monday", 2));
        series1.getData().add(new XYChart.Data<String, Number>("B", 37));
        series1.getData().add(new XYChart.Data<String, Number>("C", 5));
        series1.getData().add(new XYChart.Data<String, Number>("D", 14));
        series1.getData().add(new XYChart.Data<String, Number>("E", 19));

        XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
        series2.getData().add(new XYChart.Data<String, Number>("Monday", 22));
        series2.getData().add(new XYChart.Data<String, Number>("A", 35));
        series2.getData().add(new XYChart.Data<String, Number>("B", 5));
        series2.getData().add(new XYChart.Data<String, Number>("B", 11));
        series2.getData().add(new XYChart.Data<String, Number>("D", 28));
    */
        series.setName("Days");
      //  series1.setName("Days2");
      //  series2.setName("Days3");
        myLie.getData().addAll(series); //, series1, series2);

        for (final XYChart.Data<String, Number> data:series.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    myLabel.setText("x: " +  data.getXValue() + "\nY: " + String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(), new Tooltip("x: " +  data.getXValue() + "\nY: " + String.valueOf(data.getYValue())));
                }
            });
        }
    }
}
