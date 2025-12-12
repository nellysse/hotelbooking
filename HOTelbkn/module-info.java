module org.example.hotelbkn {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.mysql.cj.jdbc;  // This should work with the corrected dependency

    opens org.example.hotelbkn to javafx.fxml;
    exports org.example.hotelbkn;
}