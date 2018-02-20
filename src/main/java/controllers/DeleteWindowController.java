package controllers;

import app.App;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Student;

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

    Controller parent;

    private TableView<Student> addtable;

    ObservableList<Student> addObsList;

    public void deleteEvent(ActionEvent actionEvent) {

        if (!(ID.getText()==null)){
            Long nomer = Long.parseLong(ID.getText());
            App.studentDao.delete(nomer);

        }


        Stage stage = (Stage) deleteButton.getScene().getWindow();
        stage.close();
    }

    public void setTableView(TableView<Student> tableView){
        this.addtable = tableView;
    }

    public void setAddObsList(ObservableList<Student> addObsList){
        this.addObsList = addObsList;
    }
}
