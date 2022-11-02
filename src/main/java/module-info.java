module com.example.java2022homework5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java2022homework5 to javafx.fxml;
    exports com.example.java2022homework5;
}