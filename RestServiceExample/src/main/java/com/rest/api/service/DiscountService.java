package com.rest.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.dto.DiscountEntity;
import com.rest.api.manager.DiscountManager;

@Service
public class DiscountService {

	@Autowired
	DiscountManager discountManager;

	public List<DiscountEntity> findByuserType(String userType) {
		return discountManager.findByuserType(userType);
	}

}
