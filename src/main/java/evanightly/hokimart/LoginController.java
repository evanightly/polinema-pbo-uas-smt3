package evanightly.hokimart;

import java.io.IOException;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class LoginController {

    public TextField username;
    public TextField password;
    public ImageView image;
    
    public void submit() throws IOException {
        System.out.println(username.getText());
        System.out.println(password.getText());

        App.setRoot("employee");
    }
}
