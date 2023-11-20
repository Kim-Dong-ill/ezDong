package com.javateam.memberProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javateam.memberProject.dao.CartCompleteDAO;
import com.javateam.memberProject.domain.BuyCompleteENTITY;
import com.javateam.memberProject.domain.CartCompleteEntity;
import com.javateam.memberProject.domain.CustomUser;
import com.javateam.memberProject.domain.PagingVO;
import com.javateam.memberProject.service.CartCompleteService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CartListController {

	@Autowired
	private CartCompleteService ser;
	
	@GetMapping("/cart/list")
	public String list(@RequestParam(value="page", required = false, defaultValue = "1") int page, Model model) {
		
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication()
				.getPrincipal();
		
		CustomUser customUser = (CustomUser)principal;
		
		
		List<CartCompleteEntity> i2 = ser.findAllByPagingAndUserId(page, 4, customUser.getUsername());
		
		//전체 글 수
		//int total = ser.countAll(); //11
		int total = (int)ser.countByUserId(customUser.getUsername());
		
		PagingVO pagingVO = new PagingVO(total,  page, 4);
	
		model.addAttribute("pagingVO", pagingVO);
		model.addAttribute("list", i2);
		
		return "/buy_complete/cartcomplete";
		
	}
	

}
