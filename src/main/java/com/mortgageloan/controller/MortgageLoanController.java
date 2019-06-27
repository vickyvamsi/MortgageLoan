package com.mortgageloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mortgageloan.entity.Customer;
import com.mortgageloan.service.MortgageLoanService;

@Controller
public class MortgageLoanController {
	
	@Autowired
	MortgageLoanService mortgageLoanService;

	@PostMapping("/saveCust")
	public ResponseEntity<?> saveCust(@RequestBody Customer customer){
		mortgageLoanService.createMortgageLoan(customer);
		return new ResponseEntity<String>("Customer Details Created Sucessfully",HttpStatus.OK);
	}
}
