package com.ddd.workshop.domain.miscellaneous.domain;

import java.util.List;

public class Customer {
    private Address address;
    private List<Account> accounts;

    public Customer(Address address, List<Account> accounts) {
        this.address = address;
        this.accounts = accounts;
    }

    public Address getAddress() {
        return address;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void updateAddress(Address address){
        this.address = address;
        for (Account a: accounts) {
            a.setAddress(address);
        }
    }
}
