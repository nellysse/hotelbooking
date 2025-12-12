module org.example.hotelbkn {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.hotelbkn to javafx.fxml;
    exports org.example.hotelbkn;
}