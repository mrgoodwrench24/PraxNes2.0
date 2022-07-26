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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ArticleSelectController implements Initializable {

    private State selectedState = null;
    private Program selectedProgram = null;

    @FXML
    private TableView<State> stateTableView;

    @FXML
    private TableColumn<State, String> stateCodeCol;

    @FXML
    private TableColumn<State, String> stateNameCol;

    @FXML
    private TextField searchStateTxt;

    @FXML
    private TableView<Program> programTableView;

    @FXML
    private TableColumn<Program, String> programCodeTxt;

    @FXML
    private TableColumn<Program, String> programNameTxt;

    @FXML
    private TextField searchProgramTxt;


    Stage stage;
    Parent scene;

    @FXML
    void onActionBack(ActionEvent event) throws IOException{
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/View/MainForm.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }

    @FXML
    void onActionSelect(ActionEvent event) {
        selectedState = stateTableView.getSelectionModel().getSelectedItem();
        selectedProgram = programTableView.getSelectionModel().getSelectedItem();
        String state = selectedState.getStateCode();
        String program = selectedProgram.getProgramCode();

    }

    @FXML
    public void searchProgram(ActionEvent event) {
        String search = searchProgramTxt.getText();
        ObservableList<Program> filteredPrograms = FXCollections.observableArrayList();
        ObservableList<Program> allPrograms = DataProvider.getAllPrograms();

        String programCodeSearch = search.toUpperCase();

        for (Program searchProgram : allPrograms){
            if(searchProgram.getProgramCode().contains(programCodeSearch) || searchProgram.getProgramCode().contains(search)){
                filteredPrograms.add(searchProgram);
            }
        }
        programTableView.setItems(filteredPrograms);
        searchProgramTxt.setText("");

    }

    @FXML
    void searchState(ActionEvent event) {
        String search = searchStateTxt.getText();
        ObservableList<State> filteredStates = FXCollections.observableArrayList();
        ObservableList<State> allStates = DataProvider.getAllStates();

        String stateCodeSearch = search.toUpperCase();

        for (State searchState : allStates){
            if(searchState.getStateCode().contains(stateCodeSearch) || searchState.getStateName().contains(search)){
                filteredStates.add(searchState);
            }
        }
        stateTableView.setItems(filteredStates);
        searchStateTxt.setText("");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        stateTableView.setItems(DataProvider.getAllStates());
        stateCodeCol.setCellValueFactory(new PropertyValueFactory<>("stateCode"));
        stateNameCol.setCellValueFactory(new PropertyValueFactory<>("stateName"));

        programTableView.setItems(DataProvider.getAllPrograms());
        programCodeTxt.setCellValueFactory(new PropertyValueFactory<>("programCode"));
        programNameTxt.setCellValueFactory(new PropertyValueFactory<>("programName"));


    }

}

