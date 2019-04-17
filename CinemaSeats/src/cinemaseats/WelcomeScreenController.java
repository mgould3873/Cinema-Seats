package cinemaseats;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class WelcomeScreenController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private AnchorPane welcomeScreenAnchorPane;

    @FXML
    private ChoiceBox theaterChoiceBox;

    @FXML
    private Button toMovieSelectionsButton;

    @FXML
    void toMovieSelections(ActionEvent event) {
        //Switch to movie list screen
        Parent root = null;
        FXMLLoader root1 = null;
        root1 = new FXMLLoader(getClass().getResource("MovieList.fxml"));
        try {
            root = (Parent) root1.load();
        } catch (IOException ex) {
        }
        MovieListController controller = root1.getController();
        Scene sc = new Scene(root);
        Stage st = new Stage();
        st.setScene(sc);
        st.show();
        welcomeScreenAnchorPane.getScene().getWindow().hide();
    }

    @FXML
    void initialize() {
        assert welcomeScreenAnchorPane != null : "fx:id=\"welcomeScreenAnchorPane\" was not injected: check your FXML file 'WelcomeScreen.fxml'.";
        assert theaterChoiceBox != null : "fx:id=\"theaterChoiceBox\" was not injected: check your FXML file 'WelcomeScreen.fxml'.";
        assert toMovieSelectionsButton != null : "fx:id=\"toMovieSelectionsButton\" was not injected: check your FXML file 'WelcomeScreen.fxml'.";
        
        //Adding choices to the choiceBox menu
        theaterChoiceBox.getItems().add("Regal Cinema");
        theaterChoiceBox.getItems().add("AMC Theatre");
        theaterChoiceBox.getItems().add("Cinepolis");
    }
}
