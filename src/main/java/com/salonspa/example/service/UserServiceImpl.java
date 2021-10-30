package com.salonspa.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salonspa.example.dto.UserDto;
import com.salonspa.example.entity.User;
import com.salonspa.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto saveUser(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto deleteUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
