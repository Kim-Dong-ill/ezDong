package com.javateam.memberProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.javateam.memberProject.dao.BuyCompleteDAO;
import com.javateam.memberProject.domain.BuyCompleteDTO;
import com.javateam.memberProject.domain.BuyCompleteENTITY;
import com.javateam.memberProject.domain.CustomUser;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BuyCompleteService {

	@Autowired
	private BuyCompleteDAO dao;
	
	
	public List<BuyCompleteENTITY> buycomplete(BuyCompleteDTO dto) {
		
		log.info("buypage : "+dto.toString());
		
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication()
				.getPrincipal();

		CustomUser customUser = (CustomUser)principal;
		log.info("principal : {}", principal);
		log.info("id : {}", customUser.getUsername()); // 로그인 아이디
		
		dto.setUser_id(customUser.getUsername());
		log.info("dto getId : "+dto.getUser_id());
		log.info("Dto :"+dto.toString());
		
		BuyCompleteENTITY entity = dto.toEntity();
		log.info("entity : "+entity);
		
		BuyCompleteENTITY saved = dao.save(entity);
		log.info("saved : "+saved);
			
		
		// ---- 구매 리스트 목록 보기 ---//
		List<BuyCompleteENTITY> list = dao.findAllById(customUser.getUsername());
		
		return list;
	}
	
}
