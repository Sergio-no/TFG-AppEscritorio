module org.example.tfgjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.tfgjavafx to javafx.fxml;
    exports org.example.tfgjavafx;
}