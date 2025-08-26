module com.mycompany.jfx_mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.jfx_mavenproject1 to javafx.fxml;
    exports com.mycompany.jfx_mavenproject1;
}
