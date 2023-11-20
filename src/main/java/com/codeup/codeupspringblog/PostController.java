package com.codeup.codeupspringblog;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/posts/index")
//    @ResponseBody
    public String posts(Model model){
    ArrayList <Post> allPosts = new ArrayList<>();
    Post postOne = new Post("Post One", "Hi, here it is");
    Post postTwo = new Post("Post Two", "Second Post");
    allPosts.add(postOne);
    allPosts.add(postTwo);
    model.addAttribute("allPosts", allPosts);

        return "/posts/index";
    }

    @RequestMapping(path ="/posts/{id}", method = RequestMethod.GET)
    public String individualPost(@PathVariable int id, Model model){

        Post hi = new Post("Post One", "Hi, here it is");
        model.addAttribute("individualPost", hi);

        return "/posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String create(Model model){

//        return "show";
        return "posts index page";
    }

    @PostMapping("/posts/create")
//    @ResponseBody
    public String createNewPost(@RequestParam(name = "createPost") String createPost, Model model){

//    String createPostInput = (String) model.getAttribute("input-value");
    model.addAttribute("createPost", createPost);

        return "show" + "create a new post";
    }

}
