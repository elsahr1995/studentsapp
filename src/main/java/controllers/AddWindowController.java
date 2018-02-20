package controllers;

import app.App;
import app.DateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Student;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class AddWindowController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    Button confirmButton;
    @FXML
    TextField lastname;
    @FXML TextField firstname;
    @FXML TextField secondname;
    @FXML TextField gruppa;
    @FXML
    DatePicker birthdate;

    Controller parent;

    private TableView<Student> addtable;

    ObservableList<Student> addObsList;

    public void confirmEvent(ActionEvent actionEvent) {
        String lname = lastname.getText();
        String fname = firstname.getText();
        String sname = secondname.getText();
        String grupa = gruppa.getText();
        String bdate = DateUtil.format(birthdate.getValue());

        Student student = Student.builder()
                .lastname(lname)
                .firstname(fname)
                .secondname(sname)
                .birthdate(bdate)
                .gruppa(grupa)
                .build();

        App.studentDao.add(student);

        Stage stage = (Stage) confirmButton.getScene().getWindow();
        stage.close();
    }

    public void setTableView(TableView<Student> tableView){
        this.addtable = tableView;
    }

    public void setAddObsList(ObservableList<Student> addObsList){
        this.addObsList = addObsList;
    }
}