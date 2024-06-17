package com.example.mappings.one2manydemo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mappings.one2manydemo.model.Comment;

@Repository
public interface CommentsDao extends JpaRepository<Comment,Long>{

}