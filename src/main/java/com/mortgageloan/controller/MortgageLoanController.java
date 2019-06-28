package com.mortgageloan.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mortgageloan.entity.BankEmployee;
import com.mortgageloan.entity.Customer;
import com.mortgageloan.entity.ResponseDto;
import com.mortgageloan.exception.MortgageLoanException;
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
	
	@GetMapping("/getCust/{custId}")
	public ResponseEntity<Object> getCustDetails(@PathParam("custId") Long custId){
		//System.out.println("##########################################");
		Customer cust  = mortgageLoanService.getDetailsById(custId);
		System.out.println("leeeeeeeeeeeeeeeeeeeeeeee");
		return new ResponseEntity<Object>(cust,HttpStatus.OK);
	}
	
	@PutMapping("/approval/{loanNum}/{offId}")
	public ResponseEntity<ResponseDto> approvedLoan(@PathParam("loanNum") Long loanNum,@PathParam("offId") Long offId) throws MortgageLoanException {
		return new ResponseEntity<ResponseDto>(mortgageLoanService.approvedLoan(loanNum,offId),HttpStatus.OK);
	}
	//ajdfhadjk
	@PostMapping("/saveEmp")
	public ResponseEntity<?> saveEmp(@RequestBody  BankEmployee bankEmployee){
		mortgageLoanService.createEmp(bankEmployee);
		return new ResponseEntity<String>("Bank Employee DetailsCreated Sucessfuly ",HttpStatus.OK);
	}
}
