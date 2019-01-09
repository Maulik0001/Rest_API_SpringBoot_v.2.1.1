package com.rest.api.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rest.api.dto.DiscountEntity;

@Transactional
public interface DiscountRepository extends CrudRepository<DiscountEntity, Long> 
{

	@Query("select dl from DiscountEntity dl where dl.userType=:userType") 
	public List<DiscountEntity> findByuserType(@Param("userType") String userType);

}
