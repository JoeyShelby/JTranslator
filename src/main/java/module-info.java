module com.example.jtranslator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jtranslator to javafx.fxml;
    exports com.example.jtranslator;
}