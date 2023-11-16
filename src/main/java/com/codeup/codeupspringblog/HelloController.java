package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

@GetMapping("/hello")
//ResponseBody = Hey this method thats gonna come later, whatever the return, just put it along with my return
@ResponseBody
    public String hello(){
    return "Hello, from Spring!";
}

@GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
    return "Hello, " + name + "!";
}

//Built to handle ONLY getRequests
@RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number){
    return number + " plus one is " + (number + 1) + "!";
}
}
