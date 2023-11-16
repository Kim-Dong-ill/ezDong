package com.javateam.memberProject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="products_tbl")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProductVO {

	//상품 아이디
	@Id
	@Column
	private String id; //cloth_**
	
	@Column
	private String product_name;
	@Column
	private String product_img_1;
	@Column
	private String product_img_2;
	@Column
	private String product_color_1;
	@Column
	private String product_color_2;
	@Column
	private String product_size_s;
	@Column
	private String product_size_m;
	@Column
	private String product_size_l;
	@Column
	private String product_size_xl;
	@Column
	private String product_size_2xl;
	@Column
	private String product_size_3xl;
	@Column
	private String product_size_4xl;
	@Column
	private String product_size_5xl;
	
	public ProductVO(String id, String product_name, String product_img_1, String product_img_2, String product_color_1,
			String product_color_2, String product_size_s, String product_size_m, String product_size_l,
			String product_size_xl, String product_size_2xl, String product_size_3xl, String product_size_4xl,
			String product_size_5xl) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_img_1 = product_img_1;
		this.product_img_2 = product_img_2;
		this.product_color_1 = product_color_1;
		this.product_color_2 = product_color_2;
		this.product_size_s = product_size_s;
		this.product_size_m = product_size_m;
		this.product_size_l = product_size_l;
		this.product_size_xl = product_size_xl;
		this.product_size_2xl = product_size_2xl;
		this.product_size_3xl = product_size_3xl;
		this.product_size_4xl = product_size_4xl;
		this.product_size_5xl = product_size_5xl;
	}
	
	
}
