package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.event.ActionListener;
import java.io.IOException;

public class MainWindowControllers {
    public TextField listName;

    @FXML
    private Button addListButton;

    public void addListButtonClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListWindow.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.show();
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
