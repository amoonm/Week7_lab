module com.mycompany.week7_lab {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.week7_lab to javafx.fxml;
    exports com.mycompany.week7_lab;
}
