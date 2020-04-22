package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import technicalblog.service.PostService;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public  String getAllPosts(Model model)
    {
 //       ArrayList<Post> posts = new ArrayList<>();
//        Post post1 = new Post();
//        post1.setTitle("Post1");
//        post1.setBody("I am Post  One");
//        post1.setDate(new Date());
//
//        Post post2 = new Post();
//        post2.setTitle("Post2");
//        post2.setBody("I am Post  Two");
//        post2.setDate(new Date());
//
//        Post post3 = new Post();
//        post3.setTitle("Post2");
//        post3.setBody("I am Post  Three");
//        post3.setDate(new Date());
//                                                        <!---Instead of writing this long code we use objet of post service
//        posts.add(post1);
//        posts.add(post2);
//        posts.add(post3);
//
//        model.addAttribute("posts" , posts);
//        return  "index";
        ArrayList<Post> posts = postService.getAllPosts();
        model.addAttribute("posts" , posts);
        return "index";
    }
}
