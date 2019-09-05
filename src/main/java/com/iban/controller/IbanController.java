package com.iban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iban.dto.IBANReqDTO;
import com.iban.dto.IBANResDTO;
import com.iban.service.IBANService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class IbanController {
	
	@Autowired
	IBANService ibanService;
	
	public ResponseEntity<IBANResDTO> verifyIBAN(IBANReqDTO ibanReq){
		return new ResponseEntity<IBANResDTO>(ibanService.verifyIBAN(ibanReq), HttpStatus.OK);
	}

}
