package controllers;

import app.App;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.Student;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML
    Button addButton;
    @FXML Button deleteButton;

    @FXML
    TableColumn<Student, Long> ID;
    @FXML TableColumn<Student, String> lastname;
    @FXML TableColumn<Student, String> firstname;
    @FXML TableColumn<Student, String> secondname;
    @FXML TableColumn<Student, String> birthdate;
    @FXML TableColumn<Student, String> gruppa;
    @FXML
    TableView<Student> table;

    ObservableList<Student> obsList = FXCollections.observableArrayList();

    @FXML
    private void addEvent(ActionEvent e){
        try
        {
            FXMLLoader loader = new FXMLLoader(this.getClass().getClassLoader().getResource("addWindowSample.fxml"));
            Parent root = (Parent) loader.load();
            AddWindowController addWindowController = loader.getController();
            
            Stage secondStage = new Stage();
            secondStage.setTitle("Новый студент");
            secondStage.initModality(Modality.APPLICATION_MODAL);
            secondStage.setScene(new Scene(root));
            secondStage.show();
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }

    }

    public void deleteEvent(ActionEvent actionEvent) {
        try
        {
            FXMLLoader loader = new FXMLLoader(this.getClass().getClassLoader().getResource("deleteWindowSample.fxml"));
            Parent root = (Parent) loader.load();
            DeleteWindowController deleteWindowController = loader.getController();

            Stage secondStage = new Stage();
            secondStage.setTitle("Удаление студента");
            secondStage.initModality(Modality.APPLICATION_MODAL);
            secondStage.setScene(new Scene(root));
            secondStage.show();
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
    }

    public void setTable(TableView<Student> tableView){
        this.table = tableView;
    }

    public TableView<Student> getTable() {
        return table;
    }

    public void setObsList(ObservableList<Student> obsList){
        this.obsList = obsList;
    }

    public ObservableList<Student> getObsList(){
        return obsList;
    }
}