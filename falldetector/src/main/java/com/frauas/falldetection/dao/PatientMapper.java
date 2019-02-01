package com.frauas.falldetection.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.frauas.falldetection.model.PatientInfo;

public class PatientMapper implements RowMapper<PatientInfo> {

	public PatientInfo mapRow(ResultSet resultset, int arg1) throws SQLException {
		
		PatientInfo patientInfo = new PatientInfo();
	
			patientInfo.setPatientName(resultset.getString("patientname"));
		 	patientInfo.setDefaultAddress(resultset.getString("address"));
		 	patientInfo.setEmergencyHospital(resultset.getString("hospital"));
		 	patientInfo.setEmergencyContact(resultset.getString("contact"));
		 	patientInfo.setPatientsId(resultset.getString("id"));

		return patientInfo;
	}
}
