package StatsApplication.web;

import StatsApplication.model.CSV;

import java.util.List;

import static StatsApplication.dao.StatsDAO.*;

public class Stats {

    private int id;
    private CSV csv;


    public Stats(String data) {
        this.id = idctr;
        this.csv = new CSV(id,data);

    }

    public int getId() {
        return id;
    }

    public void setData(String data) {
        csv.updateCSV(data);
    }

    public List<String> getcsv() throws Exception {
        return this.csv.readCSV();
    }
}
