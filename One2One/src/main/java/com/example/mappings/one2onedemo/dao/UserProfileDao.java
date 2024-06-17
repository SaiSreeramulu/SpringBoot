package com.example.mappings.one2onedemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mappings.one2onedemo.model.UserProfile;


@Repository
public interface UserProfileDao extends JpaRepository<UserProfile,Long>{

}