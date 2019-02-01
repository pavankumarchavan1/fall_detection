package com.frauas.falldetection.service;

import com.frauas.falldetection.model.LoginInfo;
import com.frauas.falldetection.model.PatientInfo;

public interface PatientService {
	
	  void register(PatientInfo user);

	  PatientInfo validateUser(LoginInfo login);
}
