package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.Scanner;

public class ListWindowControllers {
    public TextField listName;
    public TextField taskName;
    public TextField taskDescription;




    @FXML
    public void showAllButtonClicked(ActionEvent actionEvent) {
    }
    @FXML
    public void showCompleteItemsButtonClicked(ActionEvent actionEvent) {
    }

    @FXML
    public void showIncompleteItemsButtonClicked(ActionEvent actionEvent) {
    }

    @FXML
    public void downloadSingleListButtonClicked(ActionEvent actionEvent) {
    }

    @FXML
    public void backToMainWindowButtonClicked(MouseEvent mouseEvent) {
    }

    @FXML
    public void getListName(ActionEvent actionEvent) {
        
    }

    @FXML
    public void getTaskName(ActionEvent actionEvent) {
    }

    @FXML
    public void getTaskDescription(ActionEvent actionEvent) {
    }

    @FXML
    public void addItemButtonClicked(MouseEvent mouseEvent) {
        Scanner itemName = new Scanner(System.in);
    }

    @FXML
    public void doneButtonClicked(ActionEvent actionEvent) {
    }

    @FXML
    public void deleteItemButtonClicked(MouseEvent mouseEvent) {
    }
}
