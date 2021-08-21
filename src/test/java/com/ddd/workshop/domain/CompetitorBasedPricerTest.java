package com.ddd.workshop.domain;

import com.ddd.workshop.domain.domain_service.CompetitorBasedPricer;
import org.junit.jupiter.api.Test;

class CompetitorBasedPricerTest {

    @Test
    void shouldApplyDiscount() {
        Price p = CompetitorBasedPricer.applyDiscount("Bat",10);
        assert p.getPrice() == 9.0;
    }
}