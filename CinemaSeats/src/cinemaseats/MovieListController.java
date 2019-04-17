package cinemaseats;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MovieListController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane movieListAnchorPane;

    @FXML
    private Text chosenTheater;

    @FXML
    private ChoiceBox movieChoiceBox;

    @FXML
    private ChoiceBox movieTimeChoiceBox;

    @FXML
    private Button backToTheatersButton;

    @FXML
    private Button toSeatSelectionButton;

    @FXML
    void backToWelcomeScreen(ActionEvent event) {
        //Switch to weclome screen
        Parent root = null;
        FXMLLoader root1 = null;
        root1 = new FXMLLoader(getClass().getResource("WelcomeScreen.fxml"));
        try {
            root = (Parent) root1.load();
        } catch (IOException ex) {
        }
        WelcomeScreenController controller = root1.getController();
        Scene sc = new Scene(root);
        Stage st = new Stage();
        st.setScene(sc);
        st.show();
        movieListAnchorPane.getScene().getWindow().hide();
    }
    
    @FXML
    void generateMovieTimes(ActionEvent event) {
        movieTimeChoiceBox.getItems().clear();
        movieTimes((String)movieChoiceBox.getValue());
    }

    @FXML
    void toSeatSelection(ActionEvent event) {
        //Switch to seat selection screen
        Parent root = null;
        FXMLLoader root1 = null;
        root1 = new FXMLLoader(getClass().getResource("seatSelection.fxml"));
        try {
            root = (Parent) root1.load();
        } catch (IOException ex) {
        }
        SeatSelectionController controller = root1.getController();
        Scene sc = new Scene(root);
        Stage st = new Stage();
        st.setScene(sc);
        st.show();
        movieListAnchorPane.getScene().getWindow().hide();
    }

    @FXML
    void initialize() {
        assert movieListAnchorPane != null : "fx:id=\"movieListAnchorPane\" was not injected: check your FXML file 'MovieList.fxml'.";
        assert chosenTheater != null : "fx:id=\"chosenTheater\" was not injected: check your FXML file 'MovieList.fxml'.";
        assert movieChoiceBox != null : "fx:id=\"movieChoiceBox\" was not injected: check your FXML file 'MovieList.fxml'.";
        assert movieTimeChoiceBox != null : "fx:id=\"movieTimeChoiceBox\" was not injected: check your FXML file 'MovieList.fxml'.";
        assert backToTheatersButton != null : "fx:id=\"backToTheatersButton\" was not injected: check your FXML file 'MovieList.fxml'.";
        assert toSeatSelectionButton != null : "fx:id=\"toSeatSelectionButton\" was not injected: check your FXML file 'MovieList.fxml'.";
        
        movieChoiceBox.getItems().add("Avengers: Endgame");
        movieChoiceBox.getItems().add("Shazam");
        movieChoiceBox.getItems().add("Hellboy");
        movieChoiceBox.getItems().add("Dumbo");
        movieChoiceBox.getItems().add("Captain Marvel");
    }
    
    void theaterSelected(String theaterName) {
        chosenTheater.setText(theaterName);
    }
    
    void movieTimes(String movieName) {
        if("Avengers: Endgame".equals((String)movieChoiceBox.getValue())) {
//            movieTimeChoiceBox.hide();
            movieTimeChoiceBox.getItems().add("11:00am");
            movieTimeChoiceBox.getItems().add("1:30pm");
            movieTimeChoiceBox.getItems().add("4:00pm");
            movieTimeChoiceBox.getItems().add("6:00pm");
            movieTimeChoiceBox.getItems().add("10:00pm");
            movieTimeChoiceBox.show();
        }
        if("Shazam".equals((String)movieChoiceBox.getValue())) {
//            movieTimeChoiceBox.hide();
            movieTimeChoiceBox.getItems().add("10:00am");
            movieTimeChoiceBox.getItems().add("1:00pm");
            movieTimeChoiceBox.getItems().add("4:00pm");
            movieTimeChoiceBox.getItems().add("7:05pm");
            movieTimeChoiceBox.getItems().add("10:30pm");
            movieTimeChoiceBox.show();
        }
        if("Hellboy".equals((String)movieChoiceBox.getValue())) {
//            movieTimeChoiceBox.hide();
            movieTimeChoiceBox.getItems().add("12:30pm");
            movieTimeChoiceBox.getItems().add("3:30pm");
            movieTimeChoiceBox.getItems().add("6:30pm");
            movieTimeChoiceBox.getItems().add("9:30pm");
            movieTimeChoiceBox.show();
        }
        if("Dumbo".equals((String)movieChoiceBox.getValue())) {
//            movieTimeChoiceBox.hide();
            movieTimeChoiceBox.getItems().add("10:45am");
            movieTimeChoiceBox.getItems().add("1:35pm");
            movieTimeChoiceBox.getItems().add("4:30pm");
            movieTimeChoiceBox.getItems().add("7:25pm");
            movieTimeChoiceBox.getItems().add("10:05pm");
            movieTimeChoiceBox.show();
        }
        if("Captain Marvel".equals((String)movieChoiceBox.getValue())) {
//            movieTimeChoiceBox.hide();
            movieTimeChoiceBox.getItems().add("1:10pm");
            movieTimeChoiceBox.getItems().add("4:10pm");
            movieTimeChoiceBox.getItems().add("7:05pm");
            movieTimeChoiceBox.getItems().add("10:00pm");
            movieTimeChoiceBox.show();
        }
    }
}
