package com.javateam.memberProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javateam.memberProject.dao.ProductDAO;
import com.javateam.memberProject.domain.ProductVO;

@Service
public class ProductsService {

	@Autowired
	private ProductDAO dao;

	//id로 찾기
	public ProductVO findById(String id) {

		return dao.findById(id).get();
	}
	
}
