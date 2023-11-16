package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{numOne}/and/{numTwo}", method = RequestMethod.GET)
    @ResponseBody
    public String addNumbers(@PathVariable int numOne, @PathVariable int numTwo){
        return numOne + " plus " + numTwo + " is " + (numOne + numTwo);
    }

}
