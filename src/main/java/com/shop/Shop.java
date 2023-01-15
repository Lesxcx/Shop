package com.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Shop extends Warehouse {
    Scanner sc = new Scanner(System.in);

    private int productQuantity;
    private int productId;
    private boolean condition1 = true;
    private boolean condition2 = true;


    public Shop() {

        while (condition1) {

            System.out.println("Please enter the id of the product you want to add to the cart:");
            this.productId = sc.nextInt();
            if (this.products.containsKey(this.productId)) {
                Warehouse quantity = new Warehouse(productId);

                while (condition2) {
                    System.out.println("How many pieces do you want to order?");
                    productQuantity = sc.nextInt();
                    if (productQuantity <= quantity.warehouse.get(productId)) {
                        try {
                            BigDecimal sum = this.products.get(productId).getPrice().multiply(BigDecimal.valueOf(productQuantity));
                            System.out.println("You order: " + productQuantity + "x " + this.products.get(productId).getName());
                            System.out.println("Your total: " + sum);
                        } catch (NullPointerException e1) {
                            System.out.println(e1.getMessage());
                        }
                        condition2 = false;
                    } else {
                        System.out.println("Wrong quantity! Maximum value is: " + quantity.warehouse.get(this.productId));
                    }
                    condition1 = false;
                }
                } else{
                System.out.println("Illegal key! Try existing id.");
            }
        }
    }
}


