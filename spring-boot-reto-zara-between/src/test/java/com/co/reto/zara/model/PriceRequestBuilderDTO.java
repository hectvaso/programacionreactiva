package com.co.reto.zara.model;

public class PriceRequestBuilderDTO {

	  private Integer brandId;
	  private String startDate;
	  private String endDate;
	  private Integer productId;
	  
	  public PriceRequestBuilderDTO() {
		  this.brandId = 	1;
		  this.endDate = "2020-06-14 18.30.00";
		  this.productId = 35455;
		  this.startDate = "2020-06-14 15.00.00";
		 
	  }
	  
	  public PriceRequestBuilderDTO whithDateStart(String startDate) {
		
		this.startDate = startDate;
		return this;
	}

	public PriceRequestDTO build() {
		  
		  return new PriceRequestDTO(this.brandId,this.startDate,this.endDate,this.productId);
	  }
	  public static PriceRequestBuilderDTO arequestPriceDto() {
		  return new PriceRequestBuilderDTO();
	  }
	  
}
