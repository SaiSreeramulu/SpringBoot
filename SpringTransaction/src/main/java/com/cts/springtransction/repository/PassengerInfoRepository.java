package com.cts.springtransction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.springtransction.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}