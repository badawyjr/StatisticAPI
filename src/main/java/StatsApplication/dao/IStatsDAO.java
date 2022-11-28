package StatsApplication.dao;

import StatsApplication.web.Stats;

import java.util.List;

public interface IStatsDAO {
     List<Stats> findAll();
     Stats findById(int id);
     void addStat(String data);
     void deleteStat(int id);
}
