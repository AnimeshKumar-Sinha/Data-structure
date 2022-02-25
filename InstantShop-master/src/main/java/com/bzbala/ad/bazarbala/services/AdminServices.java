package com.bzbala.ad.bazarbala.services;

import com.bzbala.ad.bazarbala.dto.InstantShopCustomer;
import com.bzbala.ad.bazarbala.dto.InstantShopSupplier;
import com.bzbala.ad.bazarbala.exception.BazarBalaDAOException;
import com.bzbala.ad.bazarbala.exception.Result;

public interface AdminServices {
	
	public Result creteCustomer(InstantShopCustomer createBusinessUserDTO) throws BazarBalaDAOException;
	
	public Result creteSupplier(InstantShopSupplier createBusinessUserDTO) throws BazarBalaDAOException;
	
	public Result createToken(String phoneNumber,String emailId,String userType) throws BazarBalaDAOException;
	
	public Result updatePassword(String token,String password) throws BazarBalaDAOException;
}
