package com.javateam.memberProject.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BuyCompleteDTO {

	private String buy_id;//상품id
	private String user_id;//회원id
	private String buy_img;//상품 이미지
	private String buy_name;//상품 이름
	private String buy_color;//상품 색상
	private String buy_size;//상품 사이즈
	private String buy_price;//상품 가격
	private String buy_date;//구매 날짜
	
	public BuyCompleteDTO(String buy_id, String user_id, String buy_img, String buy_name, String buy_color, String buy_size,
			String buy_price, String buy_date) {
		super();
		this.buy_id = buy_id;
		this.user_id = user_id;
		this.buy_img = buy_img;
		this.buy_name = buy_name;
		this.buy_color = buy_color;
		this.buy_size = buy_size;
		this.buy_price = buy_price;
		this.buy_date = buy_date;
	}

	public BuyCompleteENTITY toEntity() {
		return new BuyCompleteENTITY(buy_id, user_id, buy_img, buy_name, buy_color, buy_size, buy_price, buy_date);
	}
	
}
