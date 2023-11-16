package com.javateam.memberProject.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javateam.memberProject.domain.ProductVO;

public interface ProductDAO extends JpaRepository<ProductVO, String>{

//	Optional<ProductVO> findById(String id);
}
