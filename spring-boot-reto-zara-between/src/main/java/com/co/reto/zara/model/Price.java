package com.co.reto.zara.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity //mark class as entity
@Table //defining class name as Table name
public class Price {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long price_list;
	
	@Column(name = "product_id")
	private Integer producId;
	
	@Column(name = "product_name")
	private String productName;
	
	@NotEmpty
	private Integer priority;
	
	@Column(name = "brand_id")
	private Integer brandId;;
	
	@Column(name = "start_date")
	// @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
	
	@Column(name = "end_date")
	// @Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	
	@NotEmpty
	private float price;
	
	@NotEmpty
	private String curr;

	public Long getPrice_list() {
		return price_list;
	}

	public void setPrice_list(Long price_list) {
		this.price_list = price_list;
	}

	public Integer getProducId() {
		return producId;
	}

	public void setProducId(Integer producId) {
		this.producId = producId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}
	
	
	
}
