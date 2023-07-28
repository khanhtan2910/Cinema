package com.assignment.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.DAO.CastAndCrewDAO;
import com.assignment.Service.CastAndCrewService;
@Service
public class CastAndCrewServiceImpl implements CastAndCrewService{
	@Autowired
	CastAndCrewDAO castAndCrewDAO;
}
