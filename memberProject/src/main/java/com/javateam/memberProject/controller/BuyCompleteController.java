package com.javateam.memberProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javateam.memberProject.domain.BuyCompleteDTO;

import com.javateam.memberProject.service.BuyCompleteService;


@Controller
public class BuyCompleteController {
	
	@Autowired
	private BuyCompleteService ser;
	

	//---buy save DB page---
	@GetMapping("/buycomplete")
	public String buycomplete(BuyCompleteDTO dto,
							 Model model) {
		
		// ---- 구매 리스트 목록 보기 ---//
		model.addAttribute("list", ser.buycomplete(dto));
		
		return "/home";
	}
	
}//
