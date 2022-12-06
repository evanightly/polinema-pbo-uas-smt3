module evanightly.hokimart {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens evanightly.hokimart to javafx.fxml;
    exports evanightly.hokimart;
}
