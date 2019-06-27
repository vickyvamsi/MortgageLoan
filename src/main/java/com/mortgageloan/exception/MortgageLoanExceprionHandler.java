package com.mortgageloan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mortgageloan.entity.ResponseDto;

@ControllerAdvice
public class MortgageLoanExceprionHandler {

	@ExceptionHandler(MortgageLoanException.class)
	public ResponseEntity<ResponseDto> mortgageException(Exception e){
		return new ResponseEntity<ResponseDto>(new ResponseDto(e.getMessage()), HttpStatus.NO_CONTENT);
	}
}
