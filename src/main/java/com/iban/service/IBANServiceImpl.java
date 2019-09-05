package com.iban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iban.dto.IBANReqDTO;
import com.iban.dto.IBANResDTO;
import com.iban.repository.IBANRepository;

@Service
public class IBANServiceImpl implements IBANService {
	
	@Autowired
	IBANRepository iBANRepository;

	@Override
	public IBANResDTO verifyIBAN(IBANReqDTO ibanReqDTO) {
		
		
		
		return null;
	}
}
