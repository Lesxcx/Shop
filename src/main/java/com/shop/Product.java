package com.shop;
import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;

    /**
     *
     * @param name assigns a name to an object of class product
     * @param price assigns a price to an object of class product
     */
    public Product(String name, BigDecimal price) throws NullPointerException{
        try {
            this.name = name;
            this.price = price;
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
