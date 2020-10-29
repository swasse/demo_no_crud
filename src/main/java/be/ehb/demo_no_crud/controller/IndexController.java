package be.ehb.demo_no_crud.controller;

import be.ehb.demo_no_crud.model.GivesAList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/", "/index"})
    public String indexMapping(ModelMap map){
        map.addAttribute("all", GivesAList.givesList());

        return "index";
    }
}
