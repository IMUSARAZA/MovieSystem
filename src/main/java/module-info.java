module com.example.moviesystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moviesystem to javafx.fxml;
    exports com.example.moviesystem;
}