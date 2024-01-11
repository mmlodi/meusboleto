package com.meusboleto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meusboleto.model.Bank;


public interface BankRepositoty extends JpaRepository<Bank,Integer>{
}
