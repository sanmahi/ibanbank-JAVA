package com.iban.service;

import com.iban.dto.IBANReqDTO;
import com.iban.dto.IBANResDTO;

public interface IBANService {

	public IBANResDTO verifyIBAN(IBANReqDTO ibanReqDTO);
}
