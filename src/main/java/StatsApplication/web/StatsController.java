package StatsApplication.web;

import StatsApplication.dao.StatsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StatsController {

    @Autowired
    private StatsDAO dao;

    @GetMapping(value = "/")
    public String index(){
        return "Stats API Homepage *** /Stats to show all statistics *** Stats/id to display a statistic by id";
    }

    @GetMapping(value = "/Stats")
    public List<Stats> getAllStats(){
        return dao.findAll();
    }

    @GetMapping(value = "/Stats/{id}")
    public Stats getStat(@PathVariable int id){
        return dao.findById(id);
    }

    @PostMapping(value = "/Stats")
    public void addStat(@RequestBody String data){
        dao.addStat(data);
    }

    @PutMapping(value = "/Stats/{id}")
    public void updateStat(@PathVariable int id, @RequestBody String data){
        dao.updateStat(id,data);
    }

    @DeleteMapping(value = "/Stats/{id}")
    public void deleteStat(@PathVariable int id){
        dao.deleteStat(id);
    }

}
