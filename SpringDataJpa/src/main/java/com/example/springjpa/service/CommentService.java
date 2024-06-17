package com.example.springjpa.service;

import java.util.List;
import java.util.Optional;

import com.example.springjpa.model.Comment;

public interface CommentService {
	
	public List<Comment> getAllComments();
	public Comment addComment(Comment comments);
	public Optional<Comment> findCommentByCid(int cid);
	public boolean deleteComment(int cid);
	public List<Comment> getCommentsByCommenter(String commenter);
	public List<Comment> findAllByCidGreaterThan(int cid);
	public List<Comment> findByCidAndCommenter(int cid, String commenter);

}