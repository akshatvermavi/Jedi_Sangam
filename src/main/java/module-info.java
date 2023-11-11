module com.example.jedi_sangam {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.jedi_sangam to javafx.fxml;
    exports com.example.jedi_sangam;
}