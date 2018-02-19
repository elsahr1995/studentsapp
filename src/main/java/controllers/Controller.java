package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.Student;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }


    @FXML
    Button addButton;
    @FXML Button deleteButton;
    @FXML
    TableView<Student> table;
    @FXML
    TableColumn ID;
    @FXML TableColumn lastname;
    @FXML TableColumn firstname;
    @FXML TableColumn secondname;
    @FXML TableColumn birthdate;
    @FXML TableColumn gruppa;

    //ObservableList<Student> students = FXCollections.observableArrayList(App.studentDao.values());

    @FXML
    private void addEvent(ActionEvent e){
        try
        {
            FXMLLoader loader = new FXMLLoader(this.getClass().getClassLoader().getResource("addWindowSample.fxml"));
            Parent root = (Parent) loader.load();

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
            Parent root = FXMLLoader.load(this.getClass().getClassLoader().getResource("deleteWindowSample.fxml"));
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



}