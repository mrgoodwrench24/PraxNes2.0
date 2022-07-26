/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.beans.value.ObservableValueBase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Michael
 */
public class DataProvider {

    private static final ObservableList<Article> allArticles = FXCollections.observableArrayList();
    private static final ObservableList<State> allStates = FXCollections.observableArrayList();
    private static final ObservableList<Program> allPrograms =FXCollections.observableArrayList();


    public static void addArticle(Article article){
        allArticles.add(article);
    }

    public static ObservableList<Article> getAllArticles(){
        return allArticles;
    }

    public static void addState(State newState){
        allStates.add(newState);

    }

    public static ObservableList<State> getAllStates(){
        return allStates;
    }

    public static void addProgram(Program newProgram){
        allPrograms.add(newProgram);
    }

    public static ObservableList<Program> getAllPrograms() {
        return allPrograms;
    }



}
