package com.co.reto.zara.model;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ProductResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-30T10:40:36.583176100-05:00[America/Bogota]")
public class PriceResponseDTO   {
	 @JsonProperty("productId")
	  private Integer productId = null;

	  @JsonProperty("brandId")
	  private Integer brandId = null;

	  @JsonProperty("price")
	  private float price = 0;

	  @JsonProperty("startDate")
	  private Date startDate = null;

	  @JsonProperty("endDate")
	  private Date endDate = null;

	  @JsonProperty("rateIdentifier")
	  private Long rateIdentifier = null;

	  public PriceResponseDTO productId(Integer productId) {
	    this.productId = productId;
	    return this;
	  }
	  

	  public PriceResponseDTO(Integer productId, Integer brandId, float price, Date startDate, Date endDate,
			Long rateIdentifier) {
		
		this.productId = productId;
		this.brandId = brandId;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rateIdentifier = rateIdentifier;
	}


	public PriceResponseDTO() {
		
	}


	/**
	   * Get productId
	   * @return productId
	  **/
	  @ApiModelProperty(value = "")

	  @Valid
	  public Integer getProductId() {
	    return productId;
	  }

	  public void setProductId(Integer productId) {
	    this.productId = productId;
	  }

	  public PriceResponseDTO brandId(Integer brandId) {
	    this.brandId = brandId;
	    return this;
	  }

	  /**
	   * Get brandId
	   * @return brandId
	  **/
	  @ApiModelProperty(value = "")

	  @Valid
	  public Integer getBrandId() {
	    return brandId;
	  }

	  public void setBrandId(Integer brandId) {
	    this.brandId = brandId;
	  }

	  public PriceResponseDTO price(Integer price) {
	    this.price = price;
	    return this;
	  }

	  /**
	   * Get price
	   * @return price
	  **/
	  @ApiModelProperty(value = "")

	  @Valid
	  public float getPrice() {
	    return price;
	  }

	  public void setPrice(float price) {
	    this.price = price;
	  }

	  public PriceResponseDTO startDate(Date startDate) {
	    this.startDate = startDate;
	    return this;
	  }

	  /**
	   * Get startDate
	   * @return startDate
	  **/
	  @ApiModelProperty(value = "")

	  public Date getStartDate() {
	    return startDate;
	  }

	  public void setStartDate(Date startDate) {
	    this.startDate = startDate;
	  }

	  public PriceResponseDTO endDate(Date endDate) {
	    this.endDate = endDate;
	    return this;
	  }

	  /**
	   * Get endDate
	   * @return endDate
	  **/
	  @ApiModelProperty(value = "")

	  public Date getEndDate() {
	    return endDate;
	  }

	  public void setEndDate(Date endDate) {
	    this.endDate = endDate;
	  }

	  public PriceResponseDTO rateIdentifier(Long rateIdentifier) {
	    this.rateIdentifier = rateIdentifier;
	    return this;
	  }

	  /**
	   * Get rateIdentifier
	   * @return rateIdentifier
	  **/
	  @ApiModelProperty(value = "")

	  @Valid
	  public Long getRateIdentifier() {
	    return rateIdentifier;
	  }

	  public void setRateIdentifier(Long rateIdentifier) {
	    this.rateIdentifier = rateIdentifier;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    PriceResponseDTO productResponse = (PriceResponseDTO) o;
	    return Objects.equals(this.productId, productResponse.productId) &&
	        Objects.equals(this.brandId, productResponse.brandId) &&
	        Objects.equals(this.price, productResponse.price) &&
	        Objects.equals(this.startDate, productResponse.startDate) &&
	        Objects.equals(this.endDate, productResponse.endDate) &&
	        Objects.equals(this.rateIdentifier, productResponse.rateIdentifier);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(productId, brandId, price, startDate, endDate, rateIdentifier);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class ProductResponse {\n");
	    
	    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
	    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
	    sb.append("    price: ").append(toIndentedString(price)).append("\n");
	    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
	    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
	    sb.append("    rateIdentifier: ").append(toIndentedString(rateIdentifier)).append("\n");
	    sb.append("}");
	    return sb.toString();
	  }

	  /**
	   * Convert the given object to string with each line indented by 4 spaces
	   * (except the first line).
	   */
	  private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }
	}
