package main.homework5_2.shop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Integer> basket;

    public ShoppingBasket() {
        basket = new HashMap<>();
    }

    public void addProduct(String product, Integer quantity) {
        basket.put(product, basket.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(String product) {
        basket.remove(product);
    }

    public void updateQuantity(String product, Integer quantity) {
        if(basket.containsKey(product)) {
            basket.put(product,quantity);
        }
    }

    public int checkProduct(String product) {
        return basket.getOrDefault(product, 0);
    }

    public void showBasket() {
        if(basket.isEmpty()) {
            System.out.println("Basket is empty");
        } else {
            System.out.println("Products in Basket: ");
            for (Map.Entry<String, Integer> entry : basket.entrySet()) {
                System.out.println("Product: "+ entry.getKey() + " |  Quantity: " + entry.getValue());
            }
        }
    }
}
