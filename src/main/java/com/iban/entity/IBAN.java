package com.iban.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class IBAN{
	private String IBANCode;
	private String bankName;
}
