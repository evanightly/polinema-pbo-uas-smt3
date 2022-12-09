module evanightly.hokimart {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;

    opens evanightly.hokimart to javafx.fxml;
    exports evanightly.hokimart;
}
