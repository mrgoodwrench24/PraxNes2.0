/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



import java.io.*;


/**
 *
 * @author Michael
 */
public class DataBase {

    public static void CSVReader() throws IOException{


        String CsvFile = "src/Model/StateArticles.csv";

        BufferedReader br;
            String line;
            br = new BufferedReader(new FileReader(CsvFile));

            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                DataProvider.addArticle(new Article(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7]));

            }
            br.close();
    }

    public static void setStates() throws IOException {
        String CsvFile = "src/Model/States.csv";

        BufferedReader br;
        String line;
        br = new BufferedReader(new FileReader(CsvFile));

        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");

            State newState = new State(values[0],values[1]);

            DataProvider.addState(newState);

        }
        br.close();

    }

    public static void setPrograms() throws IOException {
        String CsvFile = "src/Model/Programs.csv";

        BufferedReader br;
        String line;
        br = new BufferedReader(new FileReader(CsvFile));

        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            String programType = values[2];

            if(programType.contentEquals("Initial")){
                Program newProgram = new Initial(values[0],values[1],values[2]);
                DataProvider.addProgram(newProgram);
                continue;
            }
            else if(programType.contentEquals("Secondary")){
                Program newProgram = new Secondary(values[0],values[1],values[2]);
                DataProvider.addProgram(newProgram);
                continue;
            }
            else if(programType.contentEquals("Non-Licensure")){
                Program newProgram = new Exempt(values[0],values[1],values[2]);
                DataProvider.addProgram(newProgram);
                continue;
            }

        }
        br.close();

    }



}




