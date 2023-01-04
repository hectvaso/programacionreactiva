package com.co.reto.zara.util;

@SuppressWarnings("serial")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-30T10:40:36.583176100-05:00[America/Bogota]")
public class NotFoundException extends ApiException {
    @SuppressWarnings("unused")
	private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
