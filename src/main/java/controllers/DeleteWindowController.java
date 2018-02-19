package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class DeleteWindowController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    Button deleteButton;
    @FXML
    TextField ID;

    public void deleteEvent(ActionEvent actionEvent) {

        if ((ID.getText()==null)){
            Long nomer = Long.parseLong(ID.getText());
            //App.studentDao.delete(nomer);
        }

        Stage stage = (Stage) deleteButton.getScene().getWindow();
        stage.close();
    }
}
