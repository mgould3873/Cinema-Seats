package cinemaseats;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class WelcomeScreenController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<?> theaterChoiceBox;

    @FXML
    private Button toMovieSelectionsButton;

    @FXML
    void toMovieSelections(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert theaterChoiceBox != null : "fx:id=\"theaterChoiceBox\" was not injected: check your FXML file 'MovieList.fxml'.";
        assert toMovieSelectionsButton != null : "fx:id=\"toMovieSelectionsButton\" was not injected: check your FXML file 'MovieList.fxml'.";

    }
}
