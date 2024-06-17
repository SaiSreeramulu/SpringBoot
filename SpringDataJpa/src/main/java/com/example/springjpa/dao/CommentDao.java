package com.example.springjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springjpa.model.Comment;


@Repository
public interface CommentDao extends JpaRepository<Comment,Integer>{
	
	public List<Comment> findAllByCommenter(String commenter);
	public List<Comment> findByCidGreaterThan(int cid);
	
	@Query("select c from Comment c where c.cid = :cid and c.commenter = :commenter")
	//@Query(value="sql query" , nativeQuery=true)
	public List<Comment> findByCidAndCommenter(int cid, String commenter);

}