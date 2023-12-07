package library;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.*;

public class LoginController implements Initializable{
    @FXML
    private Pane login_pane;
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

        /*ProjectSystemFACADE FACADE = new ProjectSystemFACADE();

        FACADE.signUp(username, password, "email", "fn", "ln");

        if (FACADE.login(username, password) == null) {
            lbl_error.setText("Invalid login credentials.");
            return;
        }*/

        switchScreen();
    }

    private void switchScreen() throws IOException {
        login_pane.getChildren().clear();
        App.setRoot("home");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}

