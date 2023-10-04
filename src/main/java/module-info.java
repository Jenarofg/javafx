module com.mycompany.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.javafx to javafx.fxml;
    exports com.mycompany.javafx;
}
