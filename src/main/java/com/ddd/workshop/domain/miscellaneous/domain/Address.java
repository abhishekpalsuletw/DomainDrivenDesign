package com.ddd.workshop.domain.miscellaneous.domain;

import java.util.Objects;

public class Address {
    private String fullAddress;

    public Address(String fullAddress) {
        this.fullAddress = fullAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(fullAddress, address.fullAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullAddress);
    }
}
