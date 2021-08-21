package com.ddd.workshop.domain.miscellaneous.domain;

public class Account {
    private Address address;

    public Account(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
