package com.iban.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class IBAN{
	
	@Id
	private String IBANCode;
	private String bankName;
}
