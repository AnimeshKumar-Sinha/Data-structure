package com.bzbala.ad.bazarbala.order.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderRequest {
	
	private String productCode;
	
	private int quantity;
	
	private String supplierId;
	
	private String customerId;
	
	

}
