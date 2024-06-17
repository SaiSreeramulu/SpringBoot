package com.example.mappings.one2manydemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mappings.one2manydemo.dao.NewCommentDao;
import com.example.mappings.one2manydemo.dao.NewPostDao;
import com.example.mappings.one2manydemo.model.NewComment;
import com.example.mappings.one2manydemo.model.NewPost;


@SpringBootApplication
public class One2ManyApplication implements CommandLineRunner{
	
	@Autowired
	private NewPostDao postDao;
	
	@Autowired
	private NewCommentDao commentsdao;

	public static void main(String[] args) {
		SpringApplication.run(One2ManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		Comment comment1 = new Comment(9001L,"Good");
		Comment comment2 = new Comment(9002L,"average");
		Comment comment3 = new Comment(9003L,"good");
		List<Comment> comments = new ArrayList<>();
		comments.add(comment3);
		comments.add(comment2);
		comments.add(comment1);
		
		Post post = new Post(1001L,"First Post",comments);
		
		postDao.save(post);
		
		
		System.out.println("one2many mapping done..");
		
		//fetching the data
		Iterable<Post> cmts = postDao.findAll();
		cmts.forEach(System.out::println);
		
		
		
		// Update a Post
        Post existingPost = postDao.findById(1L).orElse(null);
        if (existingPost != null) {
            existingPost.setDescription("Updated Post Title");
            postDao.save(existingPost);
        }

        // Delete a Post
        //postDao.deleteById(1L);
	
		*/
		NewComment comment1 = new NewComment();
        comment1.setComments("This is the first comment");

        NewComment comment2 = new NewComment();
        comment2.setComments("This is the second comment");
        
        List<NewComment> newComments = new ArrayList<>();

        NewPost post = new NewPost();
        post.setTitle("First Post");
        post.setComments(newComments);

        comment1.setPost(post);
        comment2.setPost(post);
        postDao.save(post);
        commentsdao.save(comment1);
        commentsdao.save(comment2);
        System.out.println("one to one mapping bi directional done...");
   		
		
	}

}