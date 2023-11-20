package com.javateam.memberProject.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class CartCompleteDTO {
		
	
	private String cartId;//상품 id
	
	private String userId;//회원 id
	
	private String cartName;//상품 이름
	
	private String cartImg;//상품 이미지

	

	public CartCompleteEntity toEntity() {
		return new CartCompleteEntity(cartId, userId, cartName, cartImg);
	}
	
}
