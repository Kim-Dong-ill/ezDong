package com.javateam.memberProject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@Table(name="buy_tbl")
@NoArgsConstructor
@ToString
public class BuyCompleteENTITY {

	@Id
	@Column
	private String buy_id;//상품 id
	@Column(name="user_id")
	private String userId; //회원 id
	@Column
	private String buy_img;
	@Column
	private String buy_name;
	@Column
	private String buy_color;
	@Column
	private String buy_size;
	@Column
	private String buy_price;
	@Column
	private String buy_date;
	
	public BuyCompleteENTITY(String buy_id, String user_id, String buy_img, String buy_name, String buy_color,
			String buy_size, String buy_price, String buy_date) {
		super();
		this.buy_id = buy_id;
		this.userId = user_id;
		this.buy_img = buy_img;
		this.buy_name = buy_name;
		this.buy_color = buy_color;
		this.buy_size = buy_size;
		this.buy_price = buy_price;
		this.buy_date = buy_date;
	}

	
	
	
}
