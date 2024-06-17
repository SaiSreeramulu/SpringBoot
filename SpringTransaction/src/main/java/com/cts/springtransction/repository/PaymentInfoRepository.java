package com.cts.springtransction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.springtransction.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}