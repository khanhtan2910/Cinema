package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.PaymentDAO;
import com.assignment.Service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	PaymentDAO paymentDAO;
}
