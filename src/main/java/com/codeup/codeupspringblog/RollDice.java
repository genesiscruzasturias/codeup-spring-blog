package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

//Create a page at /roll-dice that asks the user to guess a number.
// There should be links on this page for 1 through 6 that should make a GET request to /roll-dice/n where n is the number guessed.
// This page should display a random number (the dice roll), the user's guess and a message based on whether or not they guessed the correct number.

@Controller
public class RollDice {

   @GetMapping("/roll-dice")
    public String rollDice(){
       return "roll-dice";
   }
    @GetMapping("/roll-dice/n")
//    @ResponseBody no longer plain text stirng
    public String sayHello(@PathVariable String n, Model model){
        model.addAttribute("n", "");

        return "roll-dice";
    }
    @PostMapping("/roll-dice")
    public String joinUsersGuess(@RequestParam(name = "n") String n, Model model){
//
        model.addAttribute("n", n);
//        return goes refers to HTML
        return "roll-dice";
    }

}
