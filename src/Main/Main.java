package Main;

import Model.DataBase;
import Model.DataProvider;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../View/MainForm.fxml"));
        primaryStage.setTitle("PraxNes");
        primaryStage.setScene(new Scene(root, 450, 400));
        primaryStage.show();
    }


    public static void main(String[] args) throws IOException {
        DataBase.CSVReader();



        launch(args);
    }
}
