package com.frauas.falldetection.dao;

import com.frauas.falldetection.model.LoginInfo;
import com.frauas.falldetection.model.PatientInfo;

public interface PatientDao {
	
	void register(PatientInfo user);

	PatientInfo validateUser(LoginInfo login);
}
