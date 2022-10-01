module com.example.manejo_de_cuestionarios {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.manejo_de_cuestionarios to javafx.fxml;
    exports com.example.manejo_de_cuestionarios;
    exports Controllers;
    opens Controllers to javafx.fxml;
}