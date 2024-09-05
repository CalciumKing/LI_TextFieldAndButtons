package com.example.textfieldsandbuttons;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Arrays;

public class CalculatorController {
    @FXML
    private Label math_label;

    // region Mr Riley's Code
    double firstNum;
    boolean isNewNumber;
    String operator;
    void appendNumber(ActionEvent event) {
        Button button = (Button) event.getSource();
        int num = Integer.parseInt(button.getText());
        if (isNewNumber) {
            math_label.setText("");
            math_label.setText(String.valueOf(num));
            isNewNumber = false;
        } else
            math_label.setText(math_label.getText() + num);
    }
    void selectOperator(ActionEvent event) {
        Button button = (Button) event.getSource();
        operator = button.getText();
        firstNum = Double.parseDouble(math_label.getText());
        isNewNumber = true;
    }
    void calculate(ActionEvent event) {
        double secondNum = Double.parseDouble(math_label.getText());
        math_label.setText(firstNum + " " + operator + " " + secondNum);
        switch (operator) {
            case "+":
                firstNum += secondNum;
                break;
            case "-":
                firstNum -= secondNum;
                break;
            case "*":
                firstNum *= secondNum;
                break;
            case "/":
                if (secondNum != 0)
                    firstNum /= secondNum;
                else
                    math_label.setText("Error");
                break;
        }
        math_label.setText(String.valueOf(firstNum));
    }
    // endregion

    @FXML
    private void AddMath(ActionEvent event) {
        Button button = (Button) event.getSource();
        math_label.setText(math_label.getText() + button.getText());
        /*if("0123456789".contains(button.getText()))
            math_label.setText(math_label.getText() + button.getText());
        else
            math_label.setText(math_label.getText() + " " + button.getText() + " ");*/
    }
    @FXML
    private void Clear() {
        math_label.setText("");
    }
    @FXML
    private void Equals() {
        int numSymbols = 0;
        String[] chars = math_label.getText().split("");
        System.out.println(Arrays.toString(chars));
        String[] updated = new String[chars.length];

        for (int i = 0; i < math_label.getText().length(); i++) {
            switch (chars[i].charAt(0)) {
                case '+':
                    updated[i] = String.valueOf(Integer.parseInt(chars[i - 1]) + Integer.parseInt(chars[i + 1]));
                    numSymbols++;
                    break;
                case '-':
                    updated[i] = String.valueOf(Integer.parseInt(chars[i - 1]) - Integer.parseInt(chars[i + 1]));
                    numSymbols++;
                    break;
                case '*':
                    updated[i] = String.valueOf(Integer.parseInt(chars[i - 1]) * Integer.parseInt(chars[i + 1]));
                    numSymbols++;
                    break;
                case '/':
                    updated[i] = String.valueOf(Integer.parseInt(chars[i - 1]) / Integer.parseInt(chars[i + 1]));
                    numSymbols++;
                    break;
                default:
                    updated[i] = chars[i];
                    break;
            }
        }

        for (String s : updated)
            math_label.setText(math_label.getText() + s);

        /*if(numSymbols >= 0)
            Equals();*/
//        int[] nums = new int[chars.length];
//        char[] symbols = new char[chars.length];
//        for(int i = 0; i < chars.length; i++) {
//            if("0123456789".contains(chars[i]))
//                nums[i] = Integer.parseInt(chars[i]);
//            else
//                symbols[i] = chars[i].charAt(0);
//        }
    }
}