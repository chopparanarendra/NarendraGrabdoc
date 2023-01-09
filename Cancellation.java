package com.appointment.cancellation.screen;

public class Cancellation {
	String Patient_name;
	int Patient_id;
	String Patient_Disease;
	long Patient_Number;
	public String getPatient_name() {
		return Patient_name;
	}
	public void setPatient_name(String patient_name) {
		Patient_name = patient_name;
	}
	public int getPatient_id() {
		return Patient_id;
	}
	public void setPatient_id(int patient_id) {
		Patient_id = patient_id;
	}
	public String getPatient_Disease() {
		return Patient_Disease;
	}
	public void setPatient_Disease(String patient_Disease) {
		Patient_Disease = patient_Disease;
	}
	public long getPatient_Number() {
		return Patient_Number;
	}
	public void setPatient_Number(long patient_Number) {
		Patient_Number = patient_Number;
	}
	@Override
	public String toString() {
		return "Patient [Patient_name=" + Patient_name + ", Patient_id=" + Patient_id + ", Patient_Disease="
				+ Patient_Disease + ", Patient_Number=" + Patient_Number + "]";
	}
	
	
	

}
