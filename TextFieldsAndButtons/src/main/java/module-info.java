module com.example.textfieldsandbuttons {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.textfieldsandbuttons to javafx.fxml;
    exports com.example.textfieldsandbuttons;
}