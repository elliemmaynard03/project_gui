package library;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.*;

public class LoginController implements Initializable{
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Label lbl_error;
     
    @FXML
    private void btnLoginClicked(MouseEvent event) throws IOException{
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();

        ProjectSystemFACADE FACADE = new ProjectSystemFACADE();

        if (FACADE.login(username, password) == null) {
            lbl_error.setText("Invalid login credentials.");
            return;
        }

        App.setRoot("home");
    }

    @FXML
    private void back(MouseEvent event) throws IOException {
        App.setRoot("welcome");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}

