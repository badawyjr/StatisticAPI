package StatsApplication.dao;

import StatsApplication.web.Stats;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StatsDAO implements IStatsDAO{

    List<Stats> stats = new ArrayList<>();
    public static int idctr = 1;

    public StatsDAO(){
        this.addStat("test1");
        this.addStat("test2");
        this.addStat("test3");
    }

    // Find all statistics
    public List<Stats> findAll(){
        return stats;
    }

    // Find a statistic by id
    public Stats findById(int id){
        for(Stats stat : stats) {
            if(stat.getId() == id) {
                return stat;
            }
        }
        return null;
    }


    // Add new statistic
    public void addStat(String data){
        stats.add(new Stats(data));
        idctr++;
    }

    public void updateStat(int id,String data){
        for(Stats stat : stats) {
            if(stat.getId() == id) {
                stat.setData(data);
            }
        }
    }

    //Delete a statistic
    public void deleteStat(int id){

        for(Stats stat : stats) {
            if (stat.getId() == id) {
                stats.remove(stat);
            }
        }
    }
}
