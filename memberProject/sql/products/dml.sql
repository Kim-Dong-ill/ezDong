CREATE SEQUENCE product_seq
START WITH 1
INCREMENT BY 1
MAXVALUE 99999
NOCYCLE;

  CREATE TABLE "PROJECT"."PRODUCTS_TBL" 
   (	"ID" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	"PRODUCT_NAME" VARCHAR2(100 BYTE) NOT NULL ENABLE, 
	"PRODUCT_IMG_1" VARCHAR2(100 BYTE) NOT NULL ENABLE, 
	"PRODUCT_IMG_2" VARCHAR2(100 BYTE) NOT NULL ENABLE, 
	"PRODUCT_COLOR_1" VARCHAR2(20 BYTE) , 
	"PRODUCT_COLOR_2" VARCHAR2(20 BYTE) , 
	"PRODUCT_SIZE_S" VARCHAR2(20 BYTE) ,
	"PRODUCT_SIZE_M" VARCHAR2(20 BYTE) ,
	"PRODUCT_SIZE_L" VARCHAR2(20 BYTE) ,
	"PRODUCT_SIZE_XL" VARCHAR2(20 BYTE) ,
	"PRODUCT_SIZE_2XL" VARCHAR2(20 BYTE) , 
	"PRODUCT_SIZE_3XL" VARCHAR2(20 BYTE) ,
	"PRODUCT_SIZE_4XL" VARCHAR2(20 BYTE) ,
	"PRODUCT_SIZE_5XL" VARCHAR2(20 BYTE) , 
	 CONSTRAINT "TABLE1_PK" PRIMARY KEY ("ID")
	);

insert into products_tbl values (
	'cloth_' || product_seq.nextval, 
	'DEEP NIGHT! half t-shirt', 
	't1.jpg',
	't1-1.jpg',
	'black',
	'white',
	'S',
	'M',
	'L',
	'XL',
	'2XL',
	'',
	'',
	''
	);
	
insert into products_tbl values (
	'cloth_' || product_seq.nextval, 
	'as one pleases half t-shirt', 
	't2.jpg',
	't2-1.jpg',
	'black',
	'red',
	'S',
	'M',
	'L',
	'XL',
	'2XL',
	'',
	'',
	''
	);
	
	insert into products_tbl values (
	'cloth_' || product_seq.nextval, 
	'DEEP NIGHT! half t-shirt', 
	't3.jpg',
	't3-1.jpg',
	'white',
	'',
	'S',
	'M',
	'L',
	'XL',
	'2XL',
	'',
	'',
	''
	);
	
	insert into products_tbl values (
	'cloth_' || product_seq.nextval, 
	'DEEP NIGHT! half t-shirt', 
	't4.jpg',
	't4-1.jpg',
	'white',
	'',
	'S',
	'M',
	'L',
	'XL',
	'2XL',
	'',
	'',
	''
	);
	
	insert into products_tbl values (
	'cloth_' || product_seq.nextval, 
	'Shape of love half t-shirt', 
	't5.jpg',
	't5-1.jpg',
	'black',
	'white',
	'S',
	'M',
	'L',
	'XL',
	'2XL',
	'',
	'',
	''
	);
	
	insert into products_tbl values (
	'cloth_' || product_seq.nextval, 
	'MONSTER INSIDE half t-shirt', 
	't6.jpg',
	't6-1.jpg',
	'white',
	'',
	'S',
	'M',
	'L',
	'XL',
	'2XL',
	'',
	'',
	''
	);
	
	insert into products_tbl values (
	'cloth_' || product_seq.nextval, 
	'universe half t-shirt', 
	't7.jpg',
	't7-1.jpg',
	'white',
	'',
	'S',
	'M',
	'L',
	'XL',
	'2XL',
	'',
	'',
	''
	);
	
	insert into products_tbl values (
	'cloth_' || product_seq.nextval, 
	'kill bill half t-shirt', 
	't8.jpg',
	't8-1.jpg',
	'white',
	'',
	'S',
	'M',
	'L',
	'XL',
	'2XL',
	'',
	'',
	''
	);