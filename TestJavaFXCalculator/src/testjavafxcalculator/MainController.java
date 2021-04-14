/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjavafxcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class MainController implements Initializable {

    @FXML
    private Label label;
    private long num1 = 0;
    private String operator = "";
    private boolean start = true;
    
    Model model = new Model();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void processNumber(ActionEvent event) {
        if(start)
        {
            label.setText("");
            start = false;
        }
        String val = ((Button)event.getSource()).getText();
        label.setText(label.getText()+val); //num1+num2 operator something 
    }

    @FXML
    private void Operator(ActionEvent event) {
        String val = ((Button)event.getSource()).getText();
        if(!val.equals("="))
        {
            if(!operator.isEmpty())
                return;
            operator = val;
            num1 = Long.parseLong(label.getText());
            label.setText("");
        }else
        {
            if(operator.isEmpty())
                return;
            long num2 = Long.parseLong(label.getText());
            float output = model.calculate(num1,num2,operator);
            label.setText(String.valueOf(output));//show output
        }
    }
    
}
