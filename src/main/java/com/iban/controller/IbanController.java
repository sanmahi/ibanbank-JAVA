package com.iban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iban.dto.IBANReqDTO;
import com.iban.dto.IBANResDTO;
import com.iban.service.IBANService;

/**
 * @author Dhanashekar
 * class to manage iban account
 * 
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class IBANController {
	
	
	@Autowired
	IBANService ibanService;
	
	@PostMapping("/verify")
	public ResponseEntity<IBANResDTO> verifyIBAN(@RequestBody IBANReqDTO ibanReq){
		return new ResponseEntity<IBANResDTO>(ibanService.verifyIBAN(ibanReq), HttpStatus.OK);
	}

}
