package com.arc.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arc.repository.AnimalRepository;

@Service
@Transactional
public class AnimalService {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private AnimalRepository animalRepository;
	
}