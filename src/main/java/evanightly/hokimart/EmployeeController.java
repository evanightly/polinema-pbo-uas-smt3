package evanightly.hokimart;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class EmployeeController {
    public static TableView employeeTable;
    public static void main(String[] args) {
        employeeTable.getItems().add(new StringBuilder("John"));
    }
    
    @FXML
    private void logout() throws IOException {
        App.setRoot("login");
    }
}