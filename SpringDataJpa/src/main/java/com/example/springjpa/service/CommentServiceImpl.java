package com.example.springjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjpa.dao.CommentDao;
import com.example.springjpa.model.Comment;


@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	CommentDao dao;

	@Override
	public List<Comment> getAllComments() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Comment addComment(Comment comment) {
		// TODO Auto-generated method stub
		return dao.save(comment);
	}

	@Override
	public Optional<Comment> findCommentByCid(int cid) {
		// TODO Auto-generated method stub
		return dao.findById(cid);
	}

	@Override
	public boolean deleteComment(int cid) {
		// TODO Auto-generated method stub
		dao.deleteById(cid);
		return true;
	}

	@Override
	public List<Comment> getCommentsByCommenter(String commenter) {
		// TODO Auto-generated method stub
		return dao.findAllByCommenter(commenter);
	}

	@Override
	public List<Comment> findAllByCidGreaterThan(int cid) {
		// TODO Auto-generated method stub
		return dao.findByCidGreaterThan(cid);
	}

	@Override
	public List<Comment> findByCidAndCommenter(int cid, String commenter) {
		// TODO Auto-generated method stub
		return dao.findByCidAndCommenter(cid, commenter);
	}

}