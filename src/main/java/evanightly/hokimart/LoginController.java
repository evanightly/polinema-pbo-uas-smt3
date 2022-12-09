package evanightly.hokimart;

import java.io.IOException;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import model.Cashier;
import model.Manager;

public class LoginController {
    
    public TextField username;
    public TextField password;
    public ImageView image;
    
    public void submit() throws IOException {
        Boolean loggedAsManager = new Manager().login(username.getText(), password.getText());
        Boolean loggedAsCashier = new Cashier().login(username.getText(), password.getText());
        
        if (loggedAsManager) {
            App.setRoot("employee");
        } else if (loggedAsCashier) {
            App.setRoot("transactions");
        } else {
            System.out.println("You are not authenticated");
            App.setRoot("login");
        }
    }
}
