package StatsApplication;

import java.util.List;

import static StatsApplication.StatsDAO.idctr;

public class Stats {

    private int id;
    private CSV csv;


    public Stats() throws Exception {
        this.id = idctr;
        this.csv = new CSV(id);

    }

    public int getId() {
        return id;
    }

    public List<String> getCsv() throws Exception {
        return this.csv.readCSV();
    }





}
