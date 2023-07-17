/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admind
 */
public class StoreFacade {
    private List<Product> products;
    private Cart cart;

    public StoreFacade() {
        this.products = new ArrayList<>();
        this.cart = new Cart();
    }

    public void addProduct(String name, double price) {
        Product product = new Product( name, price);
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void addToCart(Product product) {
        this.cart.addProduct(product);
    }

    public void removeFromCart(Product product) {
        this.cart.removeProduct(product);
    }

    public double getCartTotalPrice() {
        return this.cart.getTotalPrice();
    }
}
