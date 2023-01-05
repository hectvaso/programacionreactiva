package com.co.reto.zara.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.co.reto.zara.model.Price;

public interface PriceRepository extends CrudRepository<Price, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM price WHERE  END_DATE =:endDate AND START_DATE =:startDate")
	 Price findPriceByDate(@Param("endDate") String endDate, @Param("startDate") String startDate);

}