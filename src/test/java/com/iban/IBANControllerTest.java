package com.iban;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iban.dto.IBANReqDTO;
import com.iban.dto.IBANResDTO;
import com.iban.entity.IBAN;
import com.iban.repository.IBANRepository;
import com.iban.service.IBANServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
public class IBANControllerTest {

	@Mock
	IBANServiceImpl iBANServiceImpl;
	
	@InjectMocks
	IBANControllerTest iBANControllerTest;
	
	
	
	IBANReqDTO iBANReqDTO = null;
	
	@Before
	public void setUP() {
		
		//iBANReqDTO.setIBAN(IBAN);
		
	}
	
	@Test
	public void testVerify() {
		fail("Not yet implemented");
		
		when(iBANServiceImpl.verifyIBAN(ibanReqDTO)
	}

}
