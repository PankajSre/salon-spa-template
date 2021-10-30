package com.salonspa.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salonspa.example.dto.PaymentDto;
import com.salonspa.example.entity.Payment;
import com.salonspa.example.repository.PaymentRepository;

@Service
public class PaymentServicesImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public PaymentDto savePayment(PaymentDto paymentDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PaymentDto> getPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentDto deletePayment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
