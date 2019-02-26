package com.my.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import com.my.dao.EmpRepository;
import com.my.domain.Emp;

public class EmpService {
	@Autowired
	private EmpRepository  empRepository;
	
	public List<Emp> findByName(String name){
		
		return empRepository.findByName(name);
	}
}
