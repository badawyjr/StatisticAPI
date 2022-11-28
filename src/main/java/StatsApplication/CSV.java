package StatsApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSV {

    private int id;

    public CSV(int id){
        this.id = id;
        this.writeCSV();
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

    public void writeCSV(){
        this.createCSV();
        try {
            FileWriter myWriter = new FileWriter("src/main/resources/csv/file"+id+".csv");
            myWriter.write("DATA");
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

}
