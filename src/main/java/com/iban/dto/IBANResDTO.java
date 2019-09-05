package com.iban.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class IBANResDTO {

	private String message;
	private String status;
	private Integer statusCode;
	private String bankName;
}
