package com.example.springjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpa.model.Comment;
import com.example.springjpa.service.CommentService;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
	
	@Autowired
	CommentService service;
	
	@GetMapping("/all")
	public List<Comment> getAllComments(){
		return service.getAllComments();
	}
	
	@GetMapping("/search/{cid}")
	public Optional<Comment> showCommentById(@PathVariable int cid){
		return service.findCommentByCid(cid);
	}
	
	@PostMapping("/add")
	public Comment addComment(@RequestBody Comment comment) {
		return service.addComment(comment);
	}
	
	@DeleteMapping("/delete/{cid}")
	public boolean deleteComment(@PathVariable int cid) {
		return service.deleteComment(cid);
	}
	
	@GetMapping("/commenter/{name}")
	public List<Comment> getAllCommentsByCommenter(@PathVariable String name){
		
		return service.getCommentsByCommenter(name);
	}
	
	@GetMapping("/{cid}")
	public List<Comment> getCommnetsGreaterThan(@PathVariable int cid){
		return service.findAllByCidGreaterThan(cid);
	}
	
	@GetMapping("/{cid}/{name}")
	public List<Comment> getCommnetsByCidAndCommenter(@PathVariable int cid,
			@PathVariable String name){
		return service.findByCidAndCommenter(cid,name);
	}

}