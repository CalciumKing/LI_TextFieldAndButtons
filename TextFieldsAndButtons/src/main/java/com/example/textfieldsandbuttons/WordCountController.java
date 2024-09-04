package com.example.textfieldsandbuttons;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
public class WordCountController {

    @FXML private TextArea text_input_box;
    @FXML private Label word_count_label, char_count_label;
    @FXML private void WordCount() {
        String[] words = text_input_box.getText().split(" ");
        word_count_label.setText(words.length + " Words");
    }
    @FXML private void CharCount() {
        char_count_label.setText(text_input_box.getLength() + " Characters");
    }
}