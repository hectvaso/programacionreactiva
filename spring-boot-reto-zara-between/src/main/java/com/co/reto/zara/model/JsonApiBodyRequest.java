package com.co.reto.zara.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Objects;

/**
 * JsonApiBodyRequest
 */
@ApiModel(description="Modelos")
public class JsonApiBodyRequest   {
  @JsonProperty("data")
  @Valid
  private List<GetPriceRequest> data ;

  public JsonApiBodyRequest data(List<GetPriceRequest> data) {
    this.data = data;
    return this;
  }

  public JsonApiBodyRequest addDataItem(GetPriceRequest dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<GetPriceRequest> getData() {
    return data;
  }

  public void setData(List<GetPriceRequest> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiBodyRequest jsonApiBodyRequest = (JsonApiBodyRequest) o;
    return Objects.equals(this.data, jsonApiBodyRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiBodyRequest {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
