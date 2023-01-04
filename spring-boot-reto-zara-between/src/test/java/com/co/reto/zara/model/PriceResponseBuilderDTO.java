package com.co.reto.zara.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PriceResponseBuilderDTO {

	  private Integer brandId;
	  private Date startDate;
	  private Date endDate;
	  private Integer productId;
	  private float price ;
	  private Long rateIdentifier;


	  
	  public PriceResponseBuilderDTO() throws ParseException {
		  this.brandId = 	1;
		  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		  this.endDate = dateFormat.parse("2020-06-14 15.00.00");
		  this.productId = 35455;
		  this.startDate = dateFormat.parse("2020-06-14 15.00.00");;
		  this.rateIdentifier = (long) 0;
		  this.price = (float) 35.50;
		  
		 
	  }
	  
	  public PriceResponseBuilderDTO whithDateStart(Date startDate) {
		
		this.startDate = startDate;
		return this;
	}
	  

	public PriceResponseBuilderDTO whithPrice(float price) {
		
		this.price = price;
		return this;
	}
	

	public PriceResponseBuilderDTO whithIdentifier(Long rateIdentifier) {
		
		this.rateIdentifier = rateIdentifier;
		return this;
	}

	public PriceResponseDTO build() {
		
		  return new PriceResponseDTO(this.productId,this.brandId,this.price,this.startDate,this.endDate,this.rateIdentifier);
	  }
	  public static PriceResponseBuilderDTO aresponsePriceDto() throws ParseException {
		  return new PriceResponseBuilderDTO();
	  }
	  
}
