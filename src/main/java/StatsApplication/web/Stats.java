package StatsApplication.web;

import StatsApplication.model.CSV;

import java.util.List;

import static StatsApplication.dao.StatsDAO.*;

public class Stats {

    private int id;
    private CSV csv;


    public Stats() {
        this.id = idctr;
        this.csv = new CSV(id,"Test");

    }

    public int getId() {
        return id;
    }

    public List<String> getCsv() throws Exception {
        return this.csv.readCSV();
    }
}
