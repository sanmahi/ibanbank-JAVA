package com.iban.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IBANResDTO {

	private String message;
	private String status;
	private Integer statusCode;
	private String bankName;
}
