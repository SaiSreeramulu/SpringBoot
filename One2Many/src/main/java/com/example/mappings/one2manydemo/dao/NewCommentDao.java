package com.example.mappings.one2manydemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mappings.one2manydemo.model.NewComment;

public interface NewCommentDao extends JpaRepository<NewComment,Long>{

}