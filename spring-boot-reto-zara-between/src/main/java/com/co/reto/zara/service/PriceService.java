package com.co.reto.zara.service;

import com.co.reto.zara.model.JsonApiBodyRequest;
import com.co.reto.zara.model.JsonApiBodyResponseSuccess;


public interface PriceService {
	
	JsonApiBodyResponseSuccess getPriceByDate(JsonApiBodyRequest body);
	
}
