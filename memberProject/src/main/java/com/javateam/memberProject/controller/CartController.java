package com.javateam.memberProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javateam.memberProject.dao.CartCompleteDAO;
import com.javateam.memberProject.domain.CartCompleteDTO;
import com.javateam.memberProject.domain.CartCompleteEntity;
import com.javateam.memberProject.domain.CustomUser;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CartController {

	@Autowired
	private CartCompleteDAO dao;
	
	@GetMapping("/cart")
	public String cart(CartCompleteDTO dto, Model model) {
	
		log.info("cart");
		log.info("dto : "+dto.toString());
		
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication()
				.getPrincipal();

		CustomUser customUser = (CustomUser)principal;
		dto.setUserId(customUser.getUsername());
		
		CartCompleteEntity entity = dto.toEntity();
		log.info("cart entity : "+entity);
		
		CartCompleteEntity saved = dao.save(entity);
		log.info("cart saved : "+saved);
				
		/* 장바구니 리스트 목록 보기 */
		List<CartCompleteEntity> list = dao.findAllById(customUser.getUsername());
		model.addAttribute("list", list);
		
		return "home";
	}
}
