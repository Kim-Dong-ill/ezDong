package com.javateam.memberProject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@Table(name="cart_tbl")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CartCompleteEntity {

	@Id
	@Column(name="cart_id")
	private String cartId;//상품 id고유id
	
	@Column(name="user_id")
	private String userId;//회원 id
	
	@Column(name="cart_name")
	private String cartName;//상품 이름
	
	@Column(name="cart_img")
	private String cartImg;//상품 이미지

	
	
	
}
