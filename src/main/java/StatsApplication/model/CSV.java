package StatsApplication.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSV {

    private int id;

    public CSV(int id, String data){
        this.id = id;
        this.writeCSV(data);
    }

    //Create a new CSV File
    public void createCSV(){
        try {
            File myObj = new File("src/main/resources/csv/file"+id+".csv");
            myObj.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Write Date to the file

    public void writeCSV(String Data){
        this.createCSV();
        try {
            FileWriter myWriter = new FileWriter("src/main/resources/csv/file"+id+".csv");
            myWriter.write(Data);
            myWriter.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    //Read data from file
    public List<String> readCSV(){
        List<String> data = new ArrayList<>();
        try {
            File myObj = new File("src/main/resources/csv/file"+id+".csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                data.add(line);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }

    public void updateCSV(String Data){
        File myObj = new File("src/main/resources/csv/file"+id+".csv");
        myObj.delete();
        writeCSV(Data);
    }

    public void deleteCSV(){
        File myObj = new File("src/main/resources/csv/file"+id+".csv");
        myObj.delete();
    }

}
