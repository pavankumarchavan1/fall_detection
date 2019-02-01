package com.frauas.falldetection.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.frauas.falldetection.dao.PatientDao;
import com.frauas.falldetection.model.LoginInfo;
import com.frauas.falldetection.model.PatientInfo;

public class PatientServiceImpl implements PatientService{
	
	
	@Autowired
	  public PatientDao patientdao;

	public void register(PatientInfo user) {

		patientdao.register(user);
		
	}

	public PatientInfo validateUser(LoginInfo login) {

		return patientdao.validateUser(login);
		
	}

}
