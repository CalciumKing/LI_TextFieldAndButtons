package com.example.textfieldsandbuttons;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TextEditorController {
    @FXML private Label count_label;
    @FXML private TextField text_input_box;

    @FXML private void ClearTextBox() {
        text_input_box.setText("");
    }

    @FXML private void CountLength() {
        count_label.setText(String.valueOf(text_input_box.getLength()));
    }
}
