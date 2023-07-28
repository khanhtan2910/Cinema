package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.ChairDAO;
import com.assignment.Service.ChairService;

@Service
public class ChairServiceImpl implements ChairService{
	@Autowired
	ChairDAO chairDAO;
}
