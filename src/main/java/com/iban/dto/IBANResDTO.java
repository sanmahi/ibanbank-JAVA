package com.iban.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IBANResDTO {

	private String message;
	private String status;
	private Integer statusCode;
	private String bankName;
}
