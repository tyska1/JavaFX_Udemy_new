package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {
    private Model model = new Model();
    @FXML private Label output;
    private long number1 = 0;
    private String operator = "";
    private boolean start = true;

    @FXML
    public void Numbers(ActionEvent event){
        if(start){
            output.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    public void Operator(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if(!value.equals("=")){
            if(!operator.isEmpty())
                return;

            operator = value;
            number1 = Long.parseLong(output.getText());
            output.setText("");
            }
            else {
                if(operator.isEmpty())
                    return;

                Long number2 = Long.parseLong(output.getText());
                float result = model.calculator(number1, number2, operator);
                output.setText(String.valueOf(result));
                operator = "";
                start = true;
                }
            }
}



