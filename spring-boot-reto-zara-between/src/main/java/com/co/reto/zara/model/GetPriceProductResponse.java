package com.co.reto.zara.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetPriceProductResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-30T10:40:36.583176100-05:00[America/Bogota]")
public class GetPriceProductResponse   {
  @JsonProperty("header")
  private Header header = null;

  @JsonProperty("response")
  private PriceResponseDTO response = null;

  public GetPriceProductResponse header(Header header) {
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

  public GetPriceProductResponse response(PriceResponseDTO response) {
    this.response = response;
    return this;
  }

  /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public PriceResponseDTO getResponse() {
    return response;
  }

  public void setResponse(PriceResponseDTO response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPriceProductResponse getPriceProductResponse = (GetPriceProductResponse) o;
    return Objects.equals(this.header, getPriceProductResponse.header) &&
        Objects.equals(this.response, getPriceProductResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPriceProductResponse {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

public GetPriceProductResponse response(Object setProductId) {
	// TODO Auto-generated method stub
	return null;
}
}
