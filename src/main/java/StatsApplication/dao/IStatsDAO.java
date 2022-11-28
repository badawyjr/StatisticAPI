package StatsApplication.dao;

import StatsApplication.web.Stats;

import java.util.List;

public interface IStatsDAO {
    public List<Stats> findAll();
    public Stats findById(int id);
    public void addStat(Stats stat);
}
