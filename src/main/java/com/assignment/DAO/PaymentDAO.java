package com.assignment.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entity.Payment;

public interface PaymentDAO extends JpaRepository<Payment, Integer>{

}
