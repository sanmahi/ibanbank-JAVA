package com.iban;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iban.controller.IbanController;
import com.iban.dto.IBANReqDTO;
import com.iban.dto.IBANResDTO;
import com.iban.service.IBANServiceImpl;
/**
 * Test case for IBANController
 * @author Dhanashekar
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class IBANControllerTest {

	@Mock
	IBANServiceImpl iBANServiceImpl;
	
	@InjectMocks
	IbanController IbanController;
	
	
	
	IBANReqDTO iBANReqDTO = null;
	IBANResDTO iBANResDTO = null;
	
	@Before
	public void setUP() {
		iBANReqDTO = new IBANReqDTO();
		iBANResDTO = new IBANResDTO();
		
		iBANReqDTO.setIBAN("12341234");
		iBANResDTO.setBankName("ABS Bank");
		iBANResDTO.setStatusCode(200);
	}
	
	@Test
	public void testVerify() {
		
		when(iBANServiceImpl.verifyIBAN(iBANReqDTO)).thenReturn(iBANResDTO);
		ResponseEntity<IBANReqDTO> req = new ResponseEntity<IBANReqDTO>(iBANReqDTO,HttpStatus.OK);
		ResponseEntity<IBANResDTO> actual = IbanController.verifyIBAN(iBANReqDTO);
		assertEquals(req.getStatusCodeValue(), actual.getStatusCodeValue());
	}

}
