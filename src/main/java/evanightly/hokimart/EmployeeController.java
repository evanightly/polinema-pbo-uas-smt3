package evanightly.hokimart;

import java.io.IOException;
import javafx.fxml.FXML;

public class EmployeeController {

    @FXML
    private void logout() throws IOException {
        App.setRoot("login");
    }
}