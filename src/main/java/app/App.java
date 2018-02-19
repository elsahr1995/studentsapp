package app;

import dao.HibernateStudentDaoImpl;
import dao.StudentDao;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends javafx.application.Application {

    //public static StudentDao studentDao = new HibernateStudentDaoImpl();

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(this.getClass().getClassLoader().getResource("sample.fxml"));
        Parent root = (Parent) loader.load();

        primaryStage.setTitle("Список студентов");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

