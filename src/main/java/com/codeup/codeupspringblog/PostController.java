package com.codeup.codeupspringblog;

import com.codeup.codeupspringblog.repositories.PostRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

    private final PostRepository postDao;

    public PostController(PostRepository postDao){
        this.postDao = postDao;
    }


    @GetMapping("/posts/index")
//    @ResponseBody
    public String posts(Model model){
    ArrayList <Post> allPosts = new ArrayList<>();
    Post postOne = new Post("Post One", "Hi, here it is");
    Post postTwo = new Post("Post Two", "Second Post");
    allPosts.add(postOne);
    allPosts.add(postTwo);
    model.addAttribute("allPosts", postDao.findAll());

        return "/posts/index";
    }

    @RequestMapping(path ="/posts/{id}", method = RequestMethod.GET)
    public String individualPost(@PathVariable int id, Model model){

        Post hi = new Post("Post One", "Hi, here it is");
        model.addAttribute("individualPost", hi);
//       Post result = postDao.findById(id);
        return "/posts/show";
    }

    @GetMapping("/posts/create")
//    @ResponseBody
    public String create(Model model){

//        model.addAttribute("post",postDao.findAll());
        return "posts/create";
    }

    @PostMapping("/posts/create")
//    @ResponseBody
    public String createNewPost(@RequestParam(name = "title") String title,@RequestParam(name = "description") String description, Model model){
        Post newPost = new Post(title,description);
//        Save method is insert equivalent MYSQL insert
        postDao.save(newPost);
        model.addAttribute("post",postDao.findAll());
        return "redirect:/posts/index";
    }

}
