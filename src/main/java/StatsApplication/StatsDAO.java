package StatsApplication;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StatsDAO {

    List<Stats> stats = new ArrayList<>();
    static int idctr = 1;

    public StatsDAO() throws Exception {
        this.addStat(new Stats());
        this.addStat(new Stats());
    }

    // Find all statistics
    List<Stats> findAll(){
        return stats;
    }

    // Find a statistic by id
    Stats findById(int id){
        for(Stats stat : stats) {
            if(stat.getId() == id) {
                return stat;
            }
        }
        return null;
    }

    // Add new statistic
    void addStat(Stats stat){
        stats.add(stat);
        idctr++;
    }

    //Delete a statistic
    void deleteStat(Stats stat){
        stats.remove(stat);
    }
}
