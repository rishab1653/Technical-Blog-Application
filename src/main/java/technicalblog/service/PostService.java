package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;
@Service
public class PostService {
    public ArrayList<Post> getAllPosts() {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Post1");
        post1.setBody("I am Post  One");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post2");
        post2.setBody("I am Post  Two");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post2");
        post3.setBody("I am Post  Three");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;


    }

    public ArrayList<Post> getOnePost()
    {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("This is your first post");
        post1.setBody("I am Post  first");
        post1.setDate(new Date());

        posts.add(post1);

        return  posts;

    }

}

