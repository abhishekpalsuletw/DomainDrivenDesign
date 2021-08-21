package com.ddd.workshop.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PricerTest {

    @Test
    void shouldApplyDiscount() {
        CompetitorPrice cp = new CompetitorPrice();
        Price p = Pricer.applyDiscount(cp.getPrice("Bat"),10);
        assert p.getPrice() == 9.0;
    }
}