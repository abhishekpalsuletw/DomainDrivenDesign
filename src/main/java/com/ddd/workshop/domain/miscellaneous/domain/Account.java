package com.ddd.workshop.domain.miscellaneous.domain;

public class Account {
    private Address address;

    public Account(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }
}
