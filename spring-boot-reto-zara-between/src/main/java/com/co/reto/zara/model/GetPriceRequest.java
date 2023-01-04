package com.co.reto.zara.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetPriceRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-30T10:40:36.583176100-05:00[America/Bogota]")
public class GetPriceRequest   {
	@JsonProperty("header")
	  private Header header = null;

	  @JsonProperty("product")
	  private PriceRequestDTO product = null;

	  public GetPriceRequest header(Header header) {
	    this.header = header;
	    return this;
	  }

	  /**
	   * Get header
	   * @return header
	  **/
	  @ApiModelProperty(required = true, value = "")
	  @NotNull

	  @Valid
	  public Header getHeader() {
	    return header;
	  }

	  public void setHeader(Header header) {
	    this.header = header;
	  }

	  public GetPriceRequest product(PriceRequestDTO product) {
	    this.product = product;
	    return this;
	  }

	  /**
	   * Get product
	   * @return product
	  **/
	  @ApiModelProperty(value = "")

	  @Valid
	  public PriceRequestDTO getProduct() {
	    return product;
	  }

	  public void setProduct(PriceRequestDTO product) {
	    this.product = product;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    GetPriceRequest getPriceRequest = (GetPriceRequest) o;
	    return Objects.equals(this.header, getPriceRequest.header) &&
	        Objects.equals(this.product, getPriceRequest.product);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(header, product);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class GetPriceRequest {\n");
	    
	    sb.append("    header: ").append(toIndentedString(header)).append("\n");
	    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

