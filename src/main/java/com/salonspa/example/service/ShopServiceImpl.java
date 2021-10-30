package com.salonspa.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salonspa.example.dto.ShopDto;
import com.salonspa.example.entity.Shop;
import com.salonspa.example.repository.ShopRepository;

@Service
public class ShopServiceImpl implements ShopService {
	@Autowired
	private ShopRepository repository;

	@Override
	public ShopDto saveShop(ShopDto shopDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShopDto> getShops() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopDto deleteShop(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
