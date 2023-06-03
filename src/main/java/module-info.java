module com.example.confofinfosecurity {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.confofinfosecurity to javafx.fxml;
    exports com.example.confofinfosecurity;
}