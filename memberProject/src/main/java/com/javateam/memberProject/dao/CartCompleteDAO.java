package com.javateam.memberProject.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.javateam.memberProject.domain.CartCompleteEntity;

public interface CartCompleteDAO extends PagingAndSortingRepository<CartCompleteEntity, String>{

	
	@Query(value = "SELECT * FROM cart_tbl "  
			 + "WHERE user_id in (SELECT user_id FROM cart_tbl "  
			 + "                 WHERE user_id = :username)", 
	   nativeQuery=true)
	
	List<CartCompleteEntity> findAllById(@Param("username") String username);

	Page<CartCompleteEntity> findAllByUserId(Pageable pageable,  String user_id);
	
	long countByUserId(String userId);
	
}
