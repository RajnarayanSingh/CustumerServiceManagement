package com.cms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cms.entities.Custumers;
import com.cms.services.CustumerService;

@RestController
public class CmsController {
	@Autowired
	private CustumerService custumerService;
@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
//get the custumers
@GetMapping("/custumers")
public Page<Custumers> getCustumers(@RequestParam int pageSize, @RequestParam int pageNumber){
	return this.custumerService.getCustumers(pageNumber, pageSize);

}
@GetMapping("/custumers/{custumerId}")
public Custumers getCustumer(@PathVariable String custumerId) {
	 return this.custumerService.getCustumer(Long.parseLong(custumerId));
			 
		
}
//add custumer
@PostMapping("/custumers" )
public Custumers addCustumer(@Valid @RequestBody Custumers custumer){
	return this.custumerService.addCustumer(custumer);

}
//update the custumer
@PutMapping("custumers")
public Custumers updateCustumer(@Valid @RequestBody Custumers custumer){
	return this.custumerService.updateCustumer(custumer);

}
//delete the custumer
@DeleteMapping("custumers/{custumerId}")
public ResponseEntity<HttpStatus> deleteCustumer(@PathVariable String custumerId ){
	try {
		this.custumerService.deleteCustumer(Long.parseLong(custumerId));
		return new ResponseEntity<>(HttpStatus.OK);
	}catch (Exception e) {
		return new ResponseEntity<> (HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}

}
