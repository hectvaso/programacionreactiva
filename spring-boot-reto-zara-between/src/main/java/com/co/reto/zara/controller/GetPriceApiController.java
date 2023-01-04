package com.co.reto.zara.controller;

import com.co.reto.zara.model.JsonApiBodyRequest;
import com.co.reto.zara.service.PriceService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-30T10:40:36.583176100-05:00[America/Bogota]")
@Controller
public class GetPriceApiController implements GetPriceApi {

    @SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(GetPriceApiController.class);

    @SuppressWarnings("unused")
	private final ObjectMapper objectMapper;

    @SuppressWarnings("unused")
	private final HttpServletRequest request;
    
    @Autowired
	private PriceService priceService;
    
    
   
    @org.springframework.beans.factory.annotation.Autowired
    public GetPriceApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<?> getDeatil( @Valid @RequestBody JsonApiBodyRequest body) throws Exception {
       
    
        try {
    		return ResponseEntity.ok(priceService.getPriceByDate(body));
		} catch (Exception e) {
			 throw new  Exception("no se encuentran coincidencias con las fechas enviadass por parámetro");
			 
		}
        
        
        
	} 

}
