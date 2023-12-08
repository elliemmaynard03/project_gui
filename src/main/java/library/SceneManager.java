package library;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {
    private static SceneManager instance = new SceneManager();
    private Stage stage;
    private final String STYLE_SHEET = "styles.css";

    private SceneManager() {
    }

    public static SceneManager getInstance() {
        return instance;
    }

    private void loadScene(String file, String style) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(file));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            scene.getStylesheets().add(getClass().getResource(style).toExternalForm());

            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showLogin() {
        loadScene("login.fxml", STYLE_SHEET);
    }

    public void showSignup() {
        loadScene("signup.fxml", STYLE_SHEET);
    }

    public void showHome() {
        loadScene("home.fxml", STYLE_SHEET);
    }
}
