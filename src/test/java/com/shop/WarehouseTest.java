package com.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    private Warehouse products;
    private Warehouse warehouse;

    @Test
    void shouldGetProducts() {
        //given
        products = new Warehouse();
        //when

        //then
        assertNotNull(products);
    }

    @Test
    void shouldGetEmptyProduct() {
        //given
        products = null;
        //when

        //then
        assertNull(products);
    }

    @Test
    void shouldGetCorrectId() {
        //given
        warehouse = new Warehouse(2);
        //when
        Integer id = warehouse.warehouse.get(2);
        //then
        assertNotNull(id);
    }

    @Test
    void shouldGetIncorrectId(){
        //given
        warehouse = new Warehouse(10);
        //when
        Integer id = warehouse.warehouse.get(10);
        //then
        assertNull(id);
    }
}