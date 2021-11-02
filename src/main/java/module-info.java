module com.converter.ecommerceconverter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.converter.ecommerceconverter to javafx.fxml;
    exports com.converter.ecommerceconverter;
}