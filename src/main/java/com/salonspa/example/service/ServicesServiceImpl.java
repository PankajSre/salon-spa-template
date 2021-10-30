package com.salonspa.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.salonspa.example.dto.ServicesDto;
import com.salonspa.example.dto.ShopDto;
import com.salonspa.example.entity.Services;
import com.salonspa.example.entity.Shop;
import com.salonspa.example.repository.ServiceRepository;

@Service
@Transactional
public class ServicesServiceImpl implements ServicesService {
	@Autowired
	private ServiceRepository serviceRepository;

	@Override
	public ServicesDto saveService(ServicesDto services) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ServicesDto> getServices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServicesDto deleteService(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
