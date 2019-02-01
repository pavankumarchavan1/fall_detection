package com.frauas.falldetection.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.frauas.falldetection.model.LoginInfo;
import com.frauas.falldetection.model.PatientInfo;

public class PatientDaoImpl implements PatientDao {

	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void register(PatientInfo user) {
		
		String sql = "insert into patientinfo values(?,?,?,?,?)";

		jdbcTemplate.update(sql, new Object[] { user.getPatientName(),  user.getDefaultAddress(), user.getEmergencyHospital(),
				user.getEmergencyContact(), user.getPatientsId()
		});

	}

	public PatientInfo validateUser(LoginInfo login) {
		
		String sql = "select * from patientinfo where patientname='" + login.getPatientName() + "' and id='" + login.getPatientID()
		+ "'";

		List<PatientInfo> users = jdbcTemplate.query(sql, new PatientMapper());

		return users.size() > 0 ? users.get(0) : null;
	}

}
