package com.codeup.codeupspringblog.jpa_lectures.controllers;

import com.codeup.codeupspringblog.jpa_lectures.repositories.FoodRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {
        private final FoodRepository foodDataAccessObject;
        public FoodController(FoodRepository foodDataAccessObject){
            this.foodDataAccessObject = foodDataAccessObject;
        }
//    Above set up x number of fields for repo(AdRespository, UserReposiroty, etc)

//    Below we'll have normal mappings and methods for get and post processing related to foods.
    @GetMapping("/lunchtime")
    public String whatsForLunch(Model model){
            model.addAttribute("lunchItems",foodDataAccessObject.findAll());
            return "lunch";
    }
}
