package com.shop;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @Test
    void shouldGetCorrectName() {
        //given
        product = new Product("Test", BigDecimal.valueOf(1.99));

        //when
        String name = product.getName();

        //then
        assertNotNull(name);
    }

    @Test
    void shouldGetEmptyName() {
        //given
        product = new Product(null, BigDecimal.valueOf(1.99));
        //when
        String name = product.getName();
        //then
        assertNull(name);
    }

    @Test
    void shouldGetCorrectPrice() {
        //given
        product = new Product("Test", BigDecimal.valueOf(1.99));
        //when
        BigDecimal price = product.getPrice();
        //then
        assertNotNull(this.product.getPrice());
    }

    @Test
    void shouldGetEmptyPrice() {
        //given
        product = new Product("Test", null);
        //when
        BigDecimal price = product.getPrice();
        //then
        assertNull(price);
    }
}