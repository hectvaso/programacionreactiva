package com.co.reto.zara.controller;

import com.co.reto.zara.model.GetPriceProductResponse;
import com.co.reto.zara.model.GetPriceRequest;
import com.co.reto.zara.model.JsonApiBodyRequest;
import com.co.reto.zara.model.JsonApiBodyResponseSuccess;
import com.co.reto.zara.service.PriceServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.ArrayList;
import java.util.List;
import static com.co.reto.zara.model.PriceRequestBuilderDTO.arequestPriceDto;
import static com.co.reto.zara.model.PriceResponseBuilderDTO.aresponsePriceDto;
import static com.co.reto.zara.model.HeaderTestDataBuilder.aHeader;


@AutoConfigureMockMvc
@SpringBootTest
public class GetPriceApiControllerTest  {

    @SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(GetPriceApiController.class);

    @Autowired
    private MockMvc mockMvc;
    
    @SuppressWarnings("unused")
	@Autowired
    private ObjectMapper objectMapper;
 
    @InjectMocks
	private PriceServiceImpl mockService;
    
    private Gson gsonConverter;
    
    private static final String DATA_JSONPATH = "$.data";
    
    @Before(value = "")
    public void setup() {
    	this.gsonConverter = new Gson();
    	
    }
    
    /*test cuando la fecha es igual a 2020-06-14 10.00.00 */
    @Test
	  void findPriceByDate() throws Exception {
    	
    	List<GetPriceRequest> listRequest = new ArrayList<>();
    	GetPriceRequest getPriceRequest = new GetPriceRequest();
    	getPriceRequest.setHeader(aHeader().build());
    	getPriceRequest.setProduct(arequestPriceDto().build());
    	
    	listRequest.add(getPriceRequest);
    	
    	JsonApiBodyRequest request = new JsonApiBodyRequest();
    	request.data(listRequest);
    	
    		
    	String controllerRquest = objectMapper.writeValueAsString(request);

    	try {
		
	    /*Act*/
	    ResultActions response = (ResultActions) mockMvc.perform(
	            post("/getPrice").contentType(MediaType.APPLICATION_JSON)
	        .content(controllerRquest).accept(MediaType.APPLICATION_JSON)
	        );
	    /*Assert*/
	     response.andExpect(status().isOk());
	     response.andExpect(jsonPath("$.data[0].response.price").value(35.5));
	     response.andExpect(jsonPath("$.data[0].response.rateIdentifier").value(1));
	     response.andExpect(jsonPath("$.data[0].response.productId").value(35455));
	     response.andExpect(jsonPath("$.data[0].response.brandId").value(1));
	    
	  } catch (Exception e) {
			// TODO: handle exception
		  
		  fail(e.getMessage());
	  }

           
    }   
    
    /*test cuando la fecha es igual a 2020-06-14 16.00.00 */
    @Test
	  void findPriceByDateTwo() throws Exception {
    	List<GetPriceRequest> listRequest = new ArrayList<>();
    	GetPriceRequest getPriceRequest = new GetPriceRequest();
    	getPriceRequest.setHeader(aHeader().build());
    	getPriceRequest.setProduct(arequestPriceDto().whithDateStart("2020-06-14 16.00.00").build());
    	
     	
    	if(getPriceRequest.getProduct().getStartDate().equals("2020-06-14 16.00.00")) {
    		getPriceRequest.setProduct(arequestPriceDto().whithDateStartAndEndDate("2020-06-14 15.00.00","2020-06-14 18.30.00").build());
        		
    	}
    	listRequest.add(getPriceRequest);
    	
    	
    	JsonApiBodyRequest request = new JsonApiBodyRequest();
    	request.data(listRequest);
    	
    	String controllerRquest = objectMapper.writeValueAsString(request);
	 
    		
    	try {
		
	    /*Act*/
	    ResultActions response = (ResultActions) mockMvc.perform(
	            post("/getPrice").contentType(MediaType.APPLICATION_JSON)
	        .content(controllerRquest).accept(MediaType.APPLICATION_JSON)
	        );
	    
	    /*Assert*/
	     response.andExpect(status().isOk());
	     response.andExpect(jsonPath("$.data[0].response.price").value(25.45));
	     response.andExpect(jsonPath("$.data[0].response.rateIdentifier").value(2));
	     response.andExpect(jsonPath("$.data[0].response.productId").value(35455));
	     response.andExpect(jsonPath("$.data[0].response.brandId").value(1));
	   
	  } catch (Exception e) {
			// TODO: handle exception
		  
		  fail(e.getMessage());
	  }

           
    }   
	

    /*test cuando la fecha es igual a 2020-06-14 21.00.00 */
    @Test
	  void findPriceByDateThree() throws Exception {
    	List<GetPriceRequest> listRequest = new ArrayList<>();
    	GetPriceRequest getPriceRequest = new GetPriceRequest();
    	getPriceRequest.setHeader(aHeader().build());
    	getPriceRequest.setProduct(arequestPriceDto().whithDateStart("2020-06-14 21.00.00").build());
    	
     	
    	if(getPriceRequest.getProduct().getStartDate().equals("2020-06-14 21.00.00")) {
    		getPriceRequest.setProduct(arequestPriceDto().whithDateStartAndEndDate("2020-06-14 00.00.00","2020-12-31 23.59.59").build());
        		
    	}
    	listRequest.add(getPriceRequest);
    	
    	
    	JsonApiBodyRequest request = new JsonApiBodyRequest();
    	request.data(listRequest);
    	
    	String controllerRquest = objectMapper.writeValueAsString(request);
	 
    	
    		try {
		
	    /*Act*/
    ResultActions response = (ResultActions) mockMvc.perform(
	            post("/getPrice").contentType(MediaType.APPLICATION_JSON)
	        .content(controllerRquest).accept(MediaType.APPLICATION_JSON)
	        );
	    /*Assert*/
    response.andExpect(status().isOk());
    response.andExpect(jsonPath("$.data[0].response.price").value(35.5));
    response.andExpect(jsonPath("$.data[0].response.rateIdentifier").value(1));
    response.andExpect(jsonPath("$.data[0].response.productId").value(35455));
    response.andExpect(jsonPath("$.data[0].response.brandId").value(1));
  
	  } catch (Exception e) {
			// TODO: handle exception
		  
		  fail(e.getMessage());
	  }

           
    }   
    /*test cuando la fecha es igual a 2020-06-15 10.00.00 */
    @Test
	  void findPriceByDateFour() throws Exception {
    	List<GetPriceRequest> listRequest = new ArrayList<>();
    	GetPriceRequest getPriceRequest = new GetPriceRequest();
    	getPriceRequest.setHeader(aHeader().build());
    	getPriceRequest.setProduct(arequestPriceDto().whithDateStart("2020-06-15 10.00.00").build());
    	
     	
    	if(getPriceRequest.getProduct().getStartDate().equals("2020-06-15 10.00.00")) {
    		getPriceRequest.setProduct(arequestPriceDto().whithDateStartAndEndDate("2020-06-15 00.00.00","2020-06-15 11.00.00").build());
        		
    	}
    	listRequest.add(getPriceRequest);
    	
    	
    	JsonApiBodyRequest request = new JsonApiBodyRequest();
    	request.data(listRequest);
    	
    	String controllerRquest = objectMapper.writeValueAsString(request);
	 
    		 try {
		
	    /*Act*/
	   ResultActions response = (ResultActions) mockMvc.perform(
	            post("/getPrice").contentType(MediaType.APPLICATION_JSON)
	        .content(controllerRquest).accept(MediaType.APPLICATION_JSON)
	        );
	    /*Assert*/
	        response.andExpect(status().isOk());
	        response.andExpect(jsonPath("$.data[0].response.price").value(30.5));
	        response.andExpect(jsonPath("$.data[0].response.rateIdentifier").value(3));
	        response.andExpect(jsonPath("$.data[0].response.productId").value(35455));
	        response.andExpect(jsonPath("$.data[0].response.brandId").value(1));
	      
	    	
	  } catch (Exception e) {
			// TODO: handle exception
		  
		  fail(e.getMessage());
	  }

           
    }   
	
    
    /*test cuando la fecha es igual a 2020-06-16 21.00.00 */
    @Test
	  void findPriceByDateFive() throws Exception {
    	List<GetPriceRequest> listRequest = new ArrayList<>();
    	GetPriceRequest getPriceRequest = new GetPriceRequest();
    	getPriceRequest.setHeader(aHeader().build());
    	getPriceRequest.setProduct(arequestPriceDto().whithDateStart("2020-06-16 21.00.00").build());
    	
     	
    	if(getPriceRequest.getProduct().getStartDate().equals("2020-06-16 21.00.00")) {
    		getPriceRequest.setProduct(arequestPriceDto().whithDateStartAndEndDate("2020-06-15 16.00.00","2020-12-31 23.59.59").build());
        		
    	}
    	listRequest.add(getPriceRequest);
    	
    	
    	JsonApiBodyRequest request = new JsonApiBodyRequest();
    	request.data(listRequest);
    	
    	String controllerRquest = objectMapper.writeValueAsString(request);
	 
    	
       try {
		
	    /*Act*/
	   ResultActions response = (ResultActions) mockMvc.perform(
	            post("/getPrice").contentType(MediaType.APPLICATION_JSON)
	        .content(controllerRquest).accept(MediaType.APPLICATION_JSON)
	        );
	    /*Assert*/
	   
	   response.andExpect(status().isOk());
       response.andExpect(jsonPath("$.data[0].response.price").value(38.95));
       response.andExpect(jsonPath("$.data[0].response.rateIdentifier").value(4));
       response.andExpect(jsonPath("$.data[0].response.productId").value(35455));
       response.andExpect(jsonPath("$.data[0].response.brandId").value(1));
     
	  } catch (Exception e) {
			// TODO: handle exception
		  
		  fail(e.getMessage());
	  }

           
    }   
	
    


}
