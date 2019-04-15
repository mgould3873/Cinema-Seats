package cinemaseats;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SeatSelectionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backToMovieListButtion;

    @FXML
    private Button reserveSeatsButton;

    @FXML
    void initialize() {
        assert backToMovieListButtion != null : "fx:id=\"backToMovieListButtion\" was not injected: check your FXML file 'seatSelection.fxml'.";
        assert reserveSeatsButton != null : "fx:id=\"reserveSeatsButton\" was not injected: check your FXML file 'seatSelection.fxml'.";

    }
}
