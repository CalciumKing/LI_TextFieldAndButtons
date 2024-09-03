package com.example.textfieldsandbuttons;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RegistrationController {
    @FXML TextField name_input, email_input, password_input;
    @FXML Label alert_label;

    @FXML private void validate() {
        if(!name_input.getText().isEmpty() &&
        !email_input.getText().isEmpty() &&
        !password_input.getText().isEmpty()) {
            alert_label.setText("Success!");
            name_input.setText("");
            email_input.setText("");
            password_input.setText("");
        } else {
            alert_label.setText("Please Fill Out All Fields");
        }
    }
}
