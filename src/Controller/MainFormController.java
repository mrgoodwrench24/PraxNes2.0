package Controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Model.DataBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class MainFormController implements Initializable {

Stage stage;
Parent scene;

public void onActionArticleLookup(ActionEvent event) throws IOException {
    stage = (Stage)((Button)event.getSource()).getScene().getWindow();
    scene = FXMLLoader.load(getClass().getResource("/View/ArticleSelect.fxml"));
    stage.setScene(new Scene(scene));
    stage.show();
    }

    public void onActionProgramType(ActionEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/View/CheatSheet.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    public void onActionExit(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            DataBase.setStates();
            DataBase.setPrograms();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
