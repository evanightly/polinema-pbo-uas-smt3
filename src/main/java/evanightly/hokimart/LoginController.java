package evanightly.hokimart;

import java.io.IOException;
import javafx.fxml.FXML;

public class LoginController {

    @FXML
    private void submit() throws IOException {
        App.setRoot("employee");
    }
}
