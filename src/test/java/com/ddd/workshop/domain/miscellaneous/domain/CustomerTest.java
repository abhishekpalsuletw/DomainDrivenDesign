package com.ddd.workshop.domain.miscellaneous.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CustomerTest {

    @Test
    void shouldUpdateAllAddressesAssocaitedWithCustomer(){
        Customer c = new Customer(new Address("<address>"), Arrays.asList(new Account(new Address("<address>"))));
        Address reqAddress = new Address("<address1>");
        c.updateAddress(reqAddress);
        assert c.getAddress().equals(reqAddress);
        for (Account a : c.getAccounts()) {
            assert a.getAddress().equals(reqAddress);
        }
    }

}