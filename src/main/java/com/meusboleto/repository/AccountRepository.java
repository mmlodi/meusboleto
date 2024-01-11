package com.meusboleto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meusboleto.model.Account;

public interface AccountRepository extends JpaRepository<Account,Integer> {

}
