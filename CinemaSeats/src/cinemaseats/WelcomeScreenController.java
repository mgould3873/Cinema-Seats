package cinemaseats;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
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
    private ChoiceBox theaterChoiceBox;

    @FXML
    private Button toMovieSelectionsButton;

    @FXML
    void toMovieSelections(ActionEvent event) {
        System.out.println("toMovieSelectionsButton Clicked");
    }

    @FXML
    void initialize() {
        assert theaterChoiceBox != null : "fx:id=\"theaterChoiceBox\" was not injected: check your FXML file 'WelcomeScreen.fxml'.";
        assert toMovieSelectionsButton != null : "fx:id=\"toMovieSelectionsButton\" was not injected: check your FXML file 'WelcomeScreen.fxml'.";
        
        theaterChoiceBox.setItems(FXCollections.observableArrayList("Regal", "Cinemark", "AMC"));
    }
}
