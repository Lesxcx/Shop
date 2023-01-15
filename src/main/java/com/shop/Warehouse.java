package com.shop;


import java.math.BigDecimal;
import java.util.*;

public class Warehouse {
    private int availability;
    private int id;

    Map<Integer, Integer> warehouse = new TreeMap<>();
    Map<Integer, Product> products = new TreeMap<>();

    /**
     *
     * @param id The id parameter is used to indicate the key, based on the key we are able to
     *           check if/in what quantity the product is available
     */
    public Warehouse(int id) {
        try {
            this.warehouse.put(this.id = 1, availability = 20);
            this.warehouse.put(this.id = 2, availability = 90);
            this.warehouse.put(this.id = 3, availability = 45);
            this.warehouse.put(this.id = 4, availability = 145);
            this.warehouse.put(this.id = 5, availability = 64);
        } catch (NullPointerException e){
            e.getMessage();
        }
        getWarehouse(id);

    }

    public Warehouse() throws NullPointerException{
        try {
            this.products.put(this.id = 1, new Product("Caffe", BigDecimal.valueOf(39.99)));
            this.products.put(this.id = 2, new Product("Milk", BigDecimal.valueOf(2.49)));
            this.products.put(this.id = 3, new Product("Soda", BigDecimal.valueOf(1.99)));
            this.products.put(this.id = 4, new Product("Bread", BigDecimal.valueOf(0.99)));
            this.products.put(this.id = 5, new Product("Tea", BigDecimal.valueOf(9.99)));
        } catch (NullPointerException e){
            e.getMessage();
        }
        getWarehouse();
    }

    /**
     * the method lists the available products
     * @throws NullPointerException
     */
    public void getWarehouse() throws NullPointerException{
        try {
            for (Map.Entry<Integer, Product> produktEntry : products.entrySet()) {
                final Integer produktId = produktEntry.getKey();
                final Product productDescription = produktEntry.getValue();

                System.out.println("Produkt id: " + produktId + " Produkt name: " + productDescription.getName() +
                        " Produkt price: " + productDescription.getPrice());
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * the method displays product availability for the given id parameter
     * @param id specifies the product id for which we want to obtain the stock status
     * @throws NullPointerException
     */
    public void getWarehouse(int id) throws NullPointerException{
        try {
            for (Map.Entry<Integer, Integer> warehouseEntry : warehouse.entrySet()) {
                final Integer productId = warehouseEntry.getKey();
                final Integer productAvailability = warehouseEntry.getValue();
                if (productId.equals(id)) {
                    System.out.println("Produkt id: " + productId + " Produkt availability: " + productAvailability);
                }
            }
        } catch (NullPointerException e){
            e.getMessage();
        }
    }
}
