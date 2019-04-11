package cinemaseats;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class MovieListController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text chosenTheater;

    @FXML
    void initialize() {
        assert chosenTheater != null : "fx:id=\"chosenTheater\" was not injected: check your FXML file 'MovieList.fxml'.";

    }
}
