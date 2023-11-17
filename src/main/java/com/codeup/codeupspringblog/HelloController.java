package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/hello") then the "/"
public class HelloController {

@GetMapping("/hello")
//ResponseBody = Hey this method thats gonna come later, whatever the return, just put it along with my return
//@ResponseBody delete and it knows it's talking to html file in return
    public String hello(){
    return "hello";
}

@GetMapping("/hello/{name}")
//    @ResponseBody no longer plain text stirng
    public String sayHello(@PathVariable String name, Model model){
    model.addAttribute("name", name);

    return "hello";
}

//Built to handle ONLY getRequests
@RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number){
    return number + " plus one is " + (number + 1) + "!";
}


}
