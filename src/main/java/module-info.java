module com.mycompany.proyecto1_joesandoval {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.proyecto1_joesandoval to javafx.fxml;
    exports com.mycompany.proyecto1_joesandoval;
}
