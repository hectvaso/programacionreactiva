package com.co.reto.zara.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.co.reto.zara.model.GetPriceProductResponse;
import com.co.reto.zara.model.JsonApiBodyRequest;
import com.co.reto.zara.model.JsonApiBodyResponseSuccess;
import com.co.reto.zara.model.Price;
import com.co.reto.zara.model.PriceResponseDTO;
import com.co.reto.zara.repository.PriceRepository;

@Service
public class PriceServiceImpl implements PriceService {
	
	@Autowired
	PriceRepository priceRepository;
	
	
	
	
	@Override
	public JsonApiBodyResponseSuccess getPriceByDate(JsonApiBodyRequest body) {
		String endDate = body.getData().get(0).getProduct().getEndDate();
		String startDate = body.getData().get(0).getProduct().getStartDate();
		
		Price price = priceRepository.findPriceByDate(endDate,startDate);
			
		PriceResponseDTO priceResponse = new PriceResponseDTO();
		GetPriceProductResponse getPriceProductResponse = new GetPriceProductResponse();
		JsonApiBodyResponseSuccess jsonApiBodyResponseSuccess = new JsonApiBodyResponseSuccess();
		
		priceResponse.setProductId(price.getProducId());
		priceResponse.setBrandId(price.getBrandId());
		priceResponse.setRateIdentifier(price.getPrice_list());
		priceResponse.setPrice(price.getPrice());
		priceResponse.setStartDate(price.getStartDate());
		priceResponse.setEndDate(price.getEndDate());
		getPriceProductResponse.setHeader(body.getData().get(0).getHeader());
		getPriceProductResponse.setResponse(priceResponse);
		jsonApiBodyResponseSuccess.addDataItem(getPriceProductResponse);
		
		
		return jsonApiBodyResponseSuccess;
	}

	

	
	
	
}
