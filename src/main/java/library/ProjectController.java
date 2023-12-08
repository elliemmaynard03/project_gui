package library;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class ProjectController implements Initializable{
    @FXML
    private TextArea column1;

    @FXML
    private TextArea column2;

    @FXML
    private void btnHomeClicked(MouseEvent event) throws IOException{
        App.setRoot("home");
    }

    @FXML
    private void btnTask1Clicked(MouseEvent event) throws IOException{
        App.setRoot("addTask");
    }

    @FXML
    private void btnTask2Clicked(MouseEvent event) throws IOException{
        App.setRoot("addTask");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
