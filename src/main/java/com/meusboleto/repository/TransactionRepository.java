package com.meusboleto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meusboleto.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Integer>{
    
}
