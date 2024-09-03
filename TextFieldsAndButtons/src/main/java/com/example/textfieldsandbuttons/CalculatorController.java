package com.example.textfieldsandbuttons;

import javafx.beans.binding.DoubleExpression;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {
    @FXML Label math_label;

    @FXML private void AddMath(ActionEvent event) {
        Button button = (Button) event.getSource();
        if("0123456789".contains(button.getText()))
            math_label.setText(math_label.getText() + button.getText());
        else
            math_label.setText(math_label.getText() + " " + button.getText() + " ");
    }
    @FXML private void Equals() {
    }
}