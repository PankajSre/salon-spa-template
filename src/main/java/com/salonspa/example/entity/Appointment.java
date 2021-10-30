package com.salonspa.example.entity;

public class Appointment {

	private int appointmentId;

	private int userId;
	private String appointmentDatetime;

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAppointmentDatetime() {
		return appointmentDatetime;
	}

	public void setAppointmentDatetime(String appointmentDatetime) {
		this.appointmentDatetime = appointmentDatetime;
	}

}
