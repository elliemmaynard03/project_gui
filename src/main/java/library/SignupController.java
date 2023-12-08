package library;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.*;

public class SignupController  implements Initializable{
    @FXML
    private TextField usernameTextBox;
    @FXML
    private TextField passwordTextBox;
    @FXML
    private TextField lastNameTextBox;
    @FXML
    private TextField firstNameTextBox;
    @FXML
    private TextField emailTextBox;
    
    @FXML
    private void signUpButton(MouseEvent event) throws IOException{
        String username = usernameTextBox.getText();
        String password = passwordTextBox.getText();
        String firstname = firstNameTextBox.getText();
        String lastname = lastNameTextBox.getText();
        String email = emailTextBox.getText();

        ProjectSystemFACADE FACADE = new ProjectSystemFACADE();

        User user = FACADE.signUp(username, password, email, firstname, lastname);
        if (user == null) {
            // error label
            return;
        }

        FACADE.setUser(user);
        SceneManager.getInstance().showHome();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
}
