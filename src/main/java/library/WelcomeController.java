package library;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

public class WelcomeController  implements Initializable {
    @FXML
    private void switchToLogin(MouseEvent event) throws IOException{
        App.setRoot("login");
    }

    @FXML
    private void switchToSignup(MouseEvent event) throws IOException{
        App.setRoot("signup");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
}
