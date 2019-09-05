package com.iban.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iban.dto.IBANReqDTO;
import com.iban.dto.IBANResDTO;
import com.iban.entity.IBAN;
import com.iban.exception.IBANException;
import com.iban.repository.IBANRepository;

/**
 * Class to handle verify IBAN
 * @author Dhanashekar
 *
 */
@Service
public class IBANServiceImpl implements IBANService {

	private static final Logger logger = LoggerFactory.getLogger(IBANServiceImpl.class);

	@Autowired
	IBANRepository iBANRepository;

	/**
	 * Method to handle verify IBAN
	 * 
	 * @author Dhanashekar
	 * @param ibanReqDTO
	 * @return IBANResDTO
	 */
	@Override
	public IBANResDTO verifyIBAN(IBANReqDTO ibanReqDTO) {

		logger.info("inside verify IBAN {}", ibanReqDTO.getIBAN());

		if (null == ibanReqDTO.getIBAN())
			throw new IBANException("IBAN number should not be null");
		
		String IBANAccount = ibanReqDTO.getIBAN().substring(4, 8);
		logger.info("trimmed IBAN {}", IBANAccount);
		Optional<IBAN> ibanOp = iBANRepository.findById(IBANAccount);

		if (!ibanOp.isPresent())
			throw new IBANException("Entered IBAN number is invalid Please verify.");

		logger.info("IBAN FOUND : {}", ibanReqDTO.getIBAN());
		return new IBANResDTO("IBAN Created Successfully", "SUCCESS", 200, ibanOp.get().getBankName());
	}
}
