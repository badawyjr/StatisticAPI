package StatsApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StatsController {

    @Autowired
    private StatsDAO dao;

    @ResponseBody
    @GetMapping(value = "/")
    public String index(){
        return "Stats API Homepage *** /Stats to show all statistics *** Stats/id to display a statistic by id";
    }

    @ResponseBody
    @GetMapping(value = "/Stats")
    public List<Stats> getAllStats(){
        return dao.findAll();
    }

    @ResponseBody
    @GetMapping(value = "/Stats/{id}")
    public Stats getStat(@PathVariable int id){
        return dao.findById(id);
    }

    @PostMapping(value = "Stats")
    public void addStat(@RequestBody Stats stat){
        dao.addStat(stat);
    }

}
