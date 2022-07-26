package Controller;

import Model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class CheatSheetController implements Initializable {

    Stage stage;
    Parent scene;


    private ObservableList<Program> allInitial = FXCollections.observableArrayList();

    private ObservableList<Program> allSecondary = FXCollections.observableArrayList();

    private ObservableList<Program> allExempt= FXCollections.observableArrayList();


    @FXML
    private TableView<Program> initialTableView;

    @FXML
    private TableColumn<Program, Integer> initialCodeTxt;

    @FXML
    private TableColumn<Program, Integer>initialNameTxt;

    @FXML
    private TableView<Program> secondaryTableView;

    @FXML
    private TableColumn<Program, Integer> secondaryCodeTxt;

    @FXML
    private TableColumn<Program, Integer> secondaryNameTxt;

    @FXML
    private TableView<Program> exemptTableView;

    @FXML
    private TableColumn<Program, Integer>exemptCodeTxt;

    @FXML
    private TableColumn<Program, Integer> exemptNameTxt;

    @FXML
    void onActionExit(ActionEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/View/MainForm.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }

    public void setAllTypes() {
        ObservableList<Program> allPrograms = DataProvider.getAllPrograms();

        for(Program program : allPrograms){
            if(program instanceof Initial){
                allInitial.add(program);
            }
            else if(program instanceof Secondary){
                allSecondary.add(program);
            }
            else if(program instanceof Exempt){
                allExempt.add(program);
            }
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO
        setAllTypes();

        initialTableView.setItems(allInitial);
        initialCodeTxt.setCellValueFactory(new PropertyValueFactory<>("programCode"));
        initialNameTxt.setCellValueFactory(new PropertyValueFactory<>("programName"));

        secondaryTableView.setItems(allSecondary);
        secondaryCodeTxt.setCellValueFactory(new PropertyValueFactory<>("programCode"));
        secondaryNameTxt.setCellValueFactory(new PropertyValueFactory<>("programName"));

        exemptTableView.setItems(allExempt);
        exemptCodeTxt.setCellValueFactory(new PropertyValueFactory<>("programCode"));
        exemptNameTxt.setCellValueFactory(new PropertyValueFactory<>("programName"));

    }


}
