package library;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import library.App;
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
    private Label firstNameLabel;
    @FXML
    private Label passwordLabel;
    @FXML
    private Label userNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label emailLabel;
    
    @FXML
    private void signUpButton(MouseEvent event) throws IOException{
        String username = usernameTextBox.getText();
        String password = passwordTextBox.getText();

        ProjectSystemFACADE FACADE = new ProjectSystemFACADE();

        if (FACADE.login(username, password) == null) {
            return;
        }

        App.setRoot("home");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
}
