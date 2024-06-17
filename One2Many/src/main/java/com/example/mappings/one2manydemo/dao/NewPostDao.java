package com.example.mappings.one2manydemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mappings.one2manydemo.model.NewPost;

public interface NewPostDao extends JpaRepository<NewPost,Long>{

}