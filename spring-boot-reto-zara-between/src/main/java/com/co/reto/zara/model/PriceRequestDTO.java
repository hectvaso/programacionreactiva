package com.co.reto.zara.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-30T10:40:36.583176100-05:00[America/Bogota]")
@ApiModel(description="PriceDto")
public class PriceRequestDTO {
	@JsonProperty("brandId")
	  private Integer brandId = null;

	  @JsonProperty("startDate")
	  private String startDate = null;

	  @JsonProperty("endDate")
	  private String endDate = null;

	  @JsonProperty("productId")
	  private Integer productId = null;

	  public PriceRequestDTO brandId(Integer brandId) {
	    this.brandId = brandId;
	    return this;
	  }

	  public PriceRequestDTO(Integer brandId, String startDate, String endDate, Integer productId) {
		
		this.brandId = brandId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.productId = productId;
	}

	public PriceRequestDTO() {
		
	}

	/**
	   * Get brandId
	   * @return brandId
	  **/
	  @ApiModelProperty(required = true, value = "")
	  @NotNull

	  @Valid
	  public Integer getBrandId() {
	    return brandId;
	  }

	  public void setBrandId(Integer brandId) {
	    this.brandId = brandId;
	  }

	  public PriceRequestDTO startDate(String startDate) {
	    this.startDate = startDate;
	    return this;
	  }

	  /**
	   * Get startDate
	   * @return startDate
	  **/
	  @ApiModelProperty(value = "")

	  public String getStartDate() {
	    return startDate;
	  }

	  public void setStartDate(String startDate) {
	    this.startDate = startDate;
	  }

	  public PriceRequestDTO endDate(String endDate) {
	    this.endDate = endDate;
	    return this;
	  }

	  /**
	   * Get endDate
	   * @return endDate
	  **/
	  @ApiModelProperty(value = "")

	  public String getEndDate() {
	    return endDate;
	  }

	  public void setEndDate(String endDate) {
	    this.endDate = endDate;
	  }

	  public PriceRequestDTO productId(Integer productId) {
	    this.productId = productId;
	    return this;
	  }

	  /**
	   * Get productId
	   * @return productId
	  **/
	  @ApiModelProperty(required = true, value = "")
	  @NotNull

	  @Valid
	  public Integer getProductId() {
	    return productId;
	  }

	  public void setProductId(Integer productId) {
	    this.productId = productId;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    PriceRequestDTO product = (PriceRequestDTO) o;
	    return Objects.equals(this.brandId, product.brandId) &&
	        Objects.equals(this.startDate, product.startDate) &&
	        Objects.equals(this.endDate, product.endDate) &&
	        Objects.equals(this.productId, product.productId);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(brandId, startDate, endDate, productId);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Product {\n");
	    
	    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
	    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
	    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
	    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
