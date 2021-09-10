package com.cms.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cms.dao.CustumerDao;
import com.cms.entities.Custumers;

@Service
public class CustumerServiceImpl implements CustumerService {
	@Autowired
	private CustumerDao custumerDao;

//	List<Custumers> list;
//	 public CustumerServiceImpl() {
//		  list= new ArrayList<>();
//		 list.add(new Custumers(145,"raj","eraj1992@gmail.com",9451412589l , "india"));
//		 list.add(new Custumers(110,"Taj","braj1992@gmail.com",8451412589l , "Hindia"));
//		// TODO Auto-generated constructor stub
//	
	
//}
	
	@Override
	public Page<Custumers> getCustumers(int pageSize, int pageNumber) {
		Pageable page= PageRequest.of(pageSize, pageNumber);
	return	custumerDao.findAll(page);
		// TODO Auto-generated method stub
		//return custumerDao.findAll();
	}

	@Override
	public Custumers getCustumer(long custumerId) {
//		Custumers c= null;
//		for(Custumers custumer:list) {
//			
//			if(custumer.getCustumerId()==custumerId) {
//				c=custumer;
//			    break;
//		}
//		}
		return custumerDao.getById((int) custumerId);	
	}

	@Override
	public Custumers addCustumer(Custumers custumer) {
		//list.add(custumer);
		// TODO Auto-generated method stub
		custumerDao.save(custumer);
		return custumer;
	}

	@Override
	public Custumers updateCustumer(Custumers custumer) {
//		list.forEach(e->{
//			if(e.getCustumerId()==custumer.getCustumerId()) {
//				e.setName(custumer.getName());
//				e.setEmail(custumer.getEmail());
//				e.setMobileNumber(custumer.getMobileNumber());
//				e.setAddress(custumer.getAddress());
//				
//			}
//		});
		custumerDao.save(custumer);
		return custumer;
	}

	@Override
	public void deleteCustumer(long parseLong) {
		//list=this.list.stream().filter(e->e.getCustumerId()!=parseLong).collect(Collectors.toList());
	Custumers entity =custumerDao.getOne((int) parseLong);
	custumerDao.delete(entity);
	}

}
