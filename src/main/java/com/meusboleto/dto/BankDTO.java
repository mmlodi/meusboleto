package com.meusboleto.dto;

import java.util.Set;

import com.meusboleto.model.Account;

public class BankDTO {
    private String id;

    private String bankId;
    private String name;
    private Integer tombstone;

    private Set<Account> accounts;
    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTombstone() {
        return tombstone;
    }

    public void setTombstone(Integer tombstone) {
        this.tombstone = tombstone;
    }

}