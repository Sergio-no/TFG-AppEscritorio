module org.example.tfgjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;

    opens org.example.tfgjavafx to javafx.fxml;
    opens org.example.tfgjavafx.controller to javafx.fxml;
    opens org.example.tfgjavafx.model to javafx.base, javafx.controls, javafx.fxml;

    exports org.example.tfgjavafx;
}