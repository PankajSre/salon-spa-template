package com.salonspa.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salonspa.example.service.AppointmentService;

@RestController
@RequestMapping("/appointmentservice")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;

}
