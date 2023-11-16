package com.javateam.memberProject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javateam.memberProject.domain.BuyCompleteENTITY;
import com.javateam.memberProject.domain.CustomUser;
import com.javateam.memberProject.domain.PagingVO;
import com.javateam.memberProject.service.BuyListService;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class BuyListController {

	@Autowired
	private BuyListService ser;
	
	
	// /memberProject/list?page=1 =1페이지를 보여준다.
	//구매 리스트
		@GetMapping("/list")
		public String list(@RequestParam(value="page", required = false, defaultValue = "1") int page, Model model) {
			
			Object principal = SecurityContextHolder.getContext()
					.getAuthentication()
					.getPrincipal();
			
			CustomUser customUser = (CustomUser)principal;
			
			
			List<BuyCompleteENTITY> i2 = ser.findAllByPagingAndUserId(page, 4, customUser.getUsername());
			
			//전체 글 수
			//int total = ser.countAll(); //11
			int total = ser.countByUserId(customUser.getUsername());
			
			PagingVO pagingVO = new PagingVO(total,  page, 4);
		
			model.addAttribute("pagingVO", pagingVO);
			model.addAttribute("list", i2);
			
			return "/buy_complete/buycomplete";
		}
	
}
