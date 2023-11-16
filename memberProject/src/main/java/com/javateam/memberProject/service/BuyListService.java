package com.javateam.memberProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.javateam.memberProject.dao.BuyCompleteDAO;
import com.javateam.memberProject.domain.BuyCompleteENTITY;
import com.javateam.memberProject.domain.CustomUser;
import com.javateam.memberProject.domain.PagingVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BuyListService {

	@Autowired
	private BuyCompleteDAO dao;
	
	
	
	 public List<BuyCompleteENTITY> list() {
	  
		 Object principal = SecurityContextHolder.getContext()
					.getAuthentication()
					.getPrincipal();
			
			CustomUser customUser = (CustomUser)principal;
			log.info("principal : {}", principal);
			log.info("id : {}", customUser.getUsername()); // 로그인 아이디
		 
	 // ---- 구매 리스트 목록 보기 ---// 
	  
	 List<BuyCompleteENTITY> list = dao.findAllById(customUser.getUsername());
	  
	 return list; }
	 
	
	public int countAll() {
		return (int)dao.count();
	}
	
	public int countByUserId(String userId) {
		return (int)dao.countByUserId(userId);
	}
	
	// ---- 구매 리스트 목록 보기 ---//
	public List<BuyCompleteENTITY> listByPage(int page, int limit) {
		
		Pageable pageable = PageRequest.of(page-1, limit);
		List<BuyCompleteENTITY> list = dao.findAll(pageable).getContent();//조회된 데이터 나중에 변경 해야함
				
		return list;
	}


	public List<BuyCompleteENTITY> findAllByPagingAndUserId(int page, int limit, String user_id) {
		
		// ---- 구매 리스트 목록 보기 ---//
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication()
				.getPrincipal();
		
		CustomUser customUser = (CustomUser)principal;
		log.info("principal : {}", principal);
		log.info("id : {}", customUser.getUsername()); // 로그인 아이디
		
		Pageable pageable = PageRequest.of(page-1, limit);
		
		Page<BuyCompleteENTITY> idpage = dao.findAllByUserId(pageable, user_id);
		List<BuyCompleteENTITY> list = idpage.getContent();
		
		
		return list;
	}
}
