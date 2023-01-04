package com.co.reto.zara.model;

public class HeaderTestDataBuilder {
	private String id = null;
	   private String type = null;

	   public HeaderTestDataBuilder() {
	      this.id = "12345";
	      this.type = "testretozara";
	   }

	   public HeaderTestDataBuilder withId(String id) {
	      this.id = id;
	      return this;
	   }

	   public HeaderTestDataBuilder withType(String type) {
	      this.type = type;
	      return this;
	   }

	   public Header build() {
	      return new Header(this.id, this.type);
	   }
	   
	   public static HeaderTestDataBuilder aHeader() {
	      return new HeaderTestDataBuilder();
	   }

}
