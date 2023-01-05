package com.co.reto.zara;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class SpringBootRetoZaraApplication implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRetoZaraApplication.class, args);
	}
	 @Override
	    public void run(String... args) throws Exception {
		 																																																													
		 template.update("INSERT INTO PRICE (PRODUCT_ID,PRODUCT_NAME,PRIORITY,BRAND_ID,START_DATE,END_DATE,PRICE_LIST,PRICE,CURR) VALUES (35455,'SHIRT',0,1,'2020-06-14 00.00.00','2020-12-31 23.59.59',1,35.50,'EUR')");
	     template.update("INSERT INTO PRICE (PRODUCT_ID,PRODUCT_NAME,PRIORITY,BRAND_ID,START_DATE,END_DATE,PRICE_LIST,PRICE,CURR) VALUES (35455,'SHIRT',1,1,'2020-06-14 15.00.00','2020-06-14 18.30.00',2,25.45,'EUR')");
	     template.update("INSERT INTO PRICE (PRODUCT_ID,PRODUCT_NAME,PRIORITY,BRAND_ID,START_DATE,END_DATE,PRICE_LIST,PRICE,CURR) VALUES (35455,'SHIRT',1,1,'2020-06-15 00.00.00','2020-06-15 11.00.00',3,30.50,'EUR')");
	     template.update("INSERT INTO PRICE (PRODUCT_ID,PRODUCT_NAME,PRIORITY,BRAND_ID,START_DATE,END_DATE,PRICE_LIST,PRICE,CURR) VALUES (35455,'SHIRT',1,1,'2020-06-15 16.00.00','2020-12-31 23.59.59',4,38.95,'EUR')");

	   }
}
