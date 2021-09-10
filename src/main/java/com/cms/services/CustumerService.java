package com.cms.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cms.entities.Custumers;

public interface CustumerService {

	public Page<Custumers> getCustumers(int pageSize, int pageNumber);

	public Custumers getCustumer(long custumerId);

	public Custumers addCustumer(Custumers custumer);

	public Custumers updateCustumer(Custumers custumer);

	public void deleteCustumer(long parseLong);

	
	
	
	
	
}
