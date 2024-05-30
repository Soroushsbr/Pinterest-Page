module com.example.pinterest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pinterest to javafx.fxml;
    exports com.example.pinterest;
}