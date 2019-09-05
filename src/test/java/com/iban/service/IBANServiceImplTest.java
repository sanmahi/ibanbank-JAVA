package com.iban.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.iban.dto.IBANReqDTO;
import com.iban.dto.IBANResDTO;
import com.iban.entity.IBAN;
import com.iban.repository.IBANRepository;

@RunWith(MockitoJUnitRunner.class)
public class IBANServiceImplTest {

	@Mock
	IBANRepository iBANRepository;

	@InjectMocks
	IBANServiceImpl iBANServiceImpl;

	IBANReqDTO iBANReqDTO = null;
	IBANResDTO iBANResDTO = null;
	IBAN iban = null;

	@Before
	public void setUp() {

		iban = new IBAN();
		iban.setBankName("ABC");
		iban.setIBANCode("1234");

		iBANReqDTO = new IBANReqDTO();
		iBANResDTO = new IBANResDTO();

		iBANReqDTO.setIBAN("123412341234");
		iBANResDTO.setBankName("ABC");
		iBANResDTO.setStatus("success");
		iBANResDTO.setStatusCode(200);
	}

	@Test
	public void testVerifyIBAN() {

		when(iBANRepository.findById("1234")).thenReturn(Optional.of(iban));
		IBANResDTO actual = iBANServiceImpl.verifyIBAN(iBANReqDTO);
		assertEquals(iBANResDTO.getStatusCode().intValue(), actual.getStatusCode().intValue());
	}

}
