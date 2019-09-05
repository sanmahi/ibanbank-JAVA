package com.iban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iban.entity.IBAN;

@Repository
public interface IBANRepository extends JpaRepository<IBAN, String>{

}
