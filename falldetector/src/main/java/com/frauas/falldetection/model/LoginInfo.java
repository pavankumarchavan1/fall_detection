package com.frauas.falldetection.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoginInfo {


	private String patientName;
	private String patientID;
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	

}
