package com.javateam.memberProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.javateam.memberProject.domain.ProductVO;
import com.javateam.memberProject.service.ProductsService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BuyPageController {

	@Autowired
	private ProductsService prse;

	
	// ---t_shirts buy---
	@GetMapping("/t_buy/{id}") // cloth_11 ~ cloth_18
	public String t1_buy(@PathVariable String id, Model model) {

		log.info("t1_buy id :" + id);

		ProductVO vo = prse.findById(id);
		log.info("===vo===" + vo);

		model.addAttribute("vo", vo);

		return "/buy_tshirt/t1_buy";

	}

	
	// ---crewneck buy---
	@GetMapping("/c_buy/{id}") // crewneck_19 ~ crewneck_26
	public String c1_buy(@PathVariable String id, Model model) {

		log.info("t1_buy id :" + id);

		ProductVO vo = prse.findById(id);
		log.info("===vo===" + vo);

		model.addAttribute("vo", vo);

		return "/buy_crewneck/c1_buy";

	}

	
	// ---hoodie buy---
	@GetMapping("/h_buy/{id}") // hoodie_27 ~ hoodie_34
	public String h1_buy(@PathVariable String id, Model model) {

		log.info("t1_buy id :" + id);

		ProductVO vo = prse.findById(id);
		log.info("===vo===" + vo);

		model.addAttribute("vo", vo);

		return "/buy_hoodie/h1_buy";

	}

}//
