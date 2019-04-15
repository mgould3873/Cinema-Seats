package cinemaseats;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;

public class MovieListController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text chosenTheater;

    @FXML
    private ChoiceBox<?> movieChoiceBox;

    @FXML
    private ChoiceBox<?> movieTimeChoiceBox;

    @FXML
    private Button backToTheatersButton;

    @FXML
    private Button toSeatSelectionButton;

    @FXML
    void initialize() {
        assert chosenTheater != null : "fx:id=\"chosenTheater\" was not injected: check your FXML file 'MovieList.fxml'.";
        assert movieChoiceBox != null : "fx:id=\"movieChoiceBox\" was not injected: check your FXML file 'MovieList.fxml'.";
        assert movieTimeChoiceBox != null : "fx:id=\"movieTimeChoiceBox\" was not injected: check your FXML file 'MovieList.fxml'.";
        assert backToTheatersButton != null : "fx:id=\"backToTheatersButton\" was not injected: check your FXML file 'MovieList.fxml'.";
        assert toSeatSelectionButton != null : "fx:id=\"toSeatSelectionButton\" was not injected: check your FXML file 'MovieList.fxml'.";

    }
}
