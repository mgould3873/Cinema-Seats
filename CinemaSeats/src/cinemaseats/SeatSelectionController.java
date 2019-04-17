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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SeatSelectionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane seatSelectionAnchorPane;

    @FXML
    private Button backToMovieListButtion;

    @FXML
    private Button reserveSeatsButton;

    @FXML
    void backToMovieList(ActionEvent event) {
        //Switch to seat selection screen
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
        seatSelectionAnchorPane.getScene().getWindow().hide();
    }

    @FXML
    void reserveSeats(ActionEvent event) {
        System.out.println("Your seats have been reserved.");
    }

    @FXML
    void initialize() {
        assert seatSelectionAnchorPane != null : "fx:id=\"seatSelectionAnchorPane\" was not injected: check your FXML file 'seatSelection.fxml'.";
        assert backToMovieListButtion != null : "fx:id=\"backToMovieListButtion\" was not injected: check your FXML file 'seatSelection.fxml'.";
        assert reserveSeatsButton != null : "fx:id=\"reserveSeatsButton\" was not injected: check your FXML file 'seatSelection.fxml'.";

    }
}
