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
        this.addStat(new Stats());
        this.addStat(new Stats());
        this.addStat(new Stats());
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
    public void addStat(Stats stat){
        System.out.println("Add");
        stats.add(stat);
        for (Stats stats : stats){
            System.out.println(stats.getId());
        }
        idctr++;
    }

    //Delete a statistic
    void deleteStat(Stats stat){
        stats.remove(stat);
    }
}
