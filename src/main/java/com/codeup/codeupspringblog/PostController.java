package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts(){
        return "posts index page";
    }

    @RequestMapping(path ="/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String individualPost(@PathVariable int id){
        return "view an individual post";
    }

    @GetMapping("/create")
    @ResponseBody
    public String create(){
        return "posts index page" +
                "<form method=\"post\" action=\"/posts/create\">\n" +
                "    <button type=\"submit\">HI</button>\n" +
                "</form>";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String createNewPost(){
        return "create a new post";
    }

}
