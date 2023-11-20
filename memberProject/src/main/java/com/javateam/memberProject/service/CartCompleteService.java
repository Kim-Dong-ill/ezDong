package com.javateam.memberProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.javateam.memberProject.dao.CartCompleteDAO;
import com.javateam.memberProject.domain.BuyCompleteENTITY;
import com.javateam.memberProject.domain.CartCompleteEntity;
import com.javateam.memberProject.domain.CustomUser;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CartCompleteService {

	@Autowired
	private CartCompleteDAO dao;
	
	
	public List<CartCompleteEntity> list() {
		  
		 Object principal = SecurityContextHolder.getContext()
					.getAuthentication()
					.getPrincipal();
			
			CustomUser customUser = (CustomUser)principal;
			log.info("principal : {}", principal);
			log.info("id : {}", customUser.getUsername()); // 로그인 아이디
		 
	 // ---- 구매 리스트 목록 보기 ---// 
	  
	 List<CartCompleteEntity> list = dao.findAllById(customUser.getUsername());
	  
	 return list; }
	 
	
	public int countAll() {
		return (int)dao.count();
	}
	
	public int countByUserId(String userId) {
		return (int)dao.countByUserId(userId);
	}
	
	// ---- 구매 리스트 목록 보기 ---//
	public List<CartCompleteEntity> listByPage(int page, int limit) {
		
		Pageable pageable = PageRequest.of(page-1, limit);
		List<CartCompleteEntity> list = dao.findAll(pageable).getContent();//조회된 데이터 나중에 변경 해야함
				
		return list;
	}


	public List<CartCompleteEntity> findAllByPagingAndUserId(int page, int limit, String user_id) {
		
		// ---- 구매 리스트 목록 보기 ---//
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication()
				.getPrincipal();
		
		CustomUser customUser = (CustomUser)principal;
		log.info("principal : {}", principal);
		log.info("id : {}", customUser.getUsername()); // 로그인 아이디
		
		Pageable pageable = PageRequest.of(page-1, limit);
		
		Page<CartCompleteEntity> idpage = dao.findAllByUserId(pageable, user_id);
		List<CartCompleteEntity> list = idpage.getContent();
		
		
		return list;
	}
}
