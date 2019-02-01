package com.frauas.falldetection.model;

public class PatientInfo {
	
	private String patientName;
	private String defaultAddress;
	private String emergencyHospital;
	private String emergencyContact;
	private String patientsId;
	
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDefaultAddress() {
		return defaultAddress;
	}
	public void setDefaultAddress(String defaultAddress) {
		this.defaultAddress = defaultAddress;
	}
	public String getEmergencyHospital() {
		return emergencyHospital;
	}
	public void setEmergencyHospital(String emergencyHospital) {
		this.emergencyHospital = emergencyHospital;
	}
	public String getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	public String getPatientsId() {
		return patientsId;
	}
	public void setPatientsId(String patientsId) {
		this.patientsId = patientsId;
	}

}