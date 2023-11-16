package com.javateam.memberProject.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.javateam.memberProject.domain.BuyCompleteENTITY;

//public interface BuyCompleteDAO extends CrudRepository<BuyCompleteENTITY, String>{
public interface BuyCompleteDAO extends PagingAndSortingRepository<BuyCompleteENTITY, String>{
	/*
	 * select * from buy_tbl where id='Qwerasdf1';
	 * Spring Boot : Spring data JPA : custom CRUD Methods
	 */
	
	@Query(value = "SELECT * FROM buy_tbl "  
			 + "WHERE user_id in (SELECT user_id FROM buy_tbl "  
			 + "                 WHERE user_id = :memberId)", 
	   nativeQuery=true)
	
	List<BuyCompleteENTITY> findAllById(@Param("memberId") String memberId);
	
	
	Page<BuyCompleteENTITY> findAllByUserId(Pageable pageable,  String user_id);
	
	
	long countByUserId(String userId);
}
