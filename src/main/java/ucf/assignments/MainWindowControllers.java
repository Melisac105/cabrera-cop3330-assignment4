package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowControllers {
    public TextField listName;

    @FXML
    public void addListBottomClicked(MouseEvent mouseEvent) throws IOException {
//        Parent root;
//        try {
//            root = FXMLLoader.load(getClass().getClassLoader().getResource("src/main/resources/ucf/assignments/ListWindow.fxml"));
//            Stage stage = new Stage();
//            stage.show();
//            //Hide current window
//            ((Node)(mouseEvent.getSource())).getScene().getWindow().hide();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @FXML
    public void printListName(ActionEvent actionEvent) {
    }

    @FXML
    public void deleteListButtonClicked(MouseEvent mouseEvent) {
    }

    @FXML
    public void uploadListsButtonClicked(ActionEvent actionEvent) {
    }

    @FXML
    public void downloadAllListsButtonClicked(ActionEvent actionEvent) {
    }
}
