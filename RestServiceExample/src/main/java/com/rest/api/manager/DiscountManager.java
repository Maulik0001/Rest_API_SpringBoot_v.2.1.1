package com.rest.api.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rest.api.dto.DiscountEntity;
import com.rest.api.repository.DiscountRepository;

@Controller
public class DiscountManager 
{
	@Autowired
	DiscountRepository discountRepository;

	public List<DiscountEntity> findByuserType(String userType) {
		return discountRepository.findByuserType(userType);
	}
	
}
