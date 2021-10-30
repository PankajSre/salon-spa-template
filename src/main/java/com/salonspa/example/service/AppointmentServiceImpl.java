package com.salonspa.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salonspa.example.dto.AppointmentDto;
import com.salonspa.example.entity.Appointment;
import com.salonspa.example.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;

	@Override
	public AppointmentDto saveAppointment(AppointmentDto appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppointmentDto> getAppointments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppointmentDto deleteAppointment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
