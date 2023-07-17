/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Cau1;
import java.util.List;
/**
 *
 * @author admind
 */
public class Cau1 {

    public static void main(String[] args) {
        StoreFacade store = new StoreFacade();
        // Thêm sản phẩm
        store.addProduct( "Áo somi", 350000);
        store.addProduct( "Áo thun", 150000);
        store.addProduct( "Quần jean", 500000);

        // Hiển thị danh sách sản phẩm
        List<Product> products = store.getProducts();
        System.out.println("Danh sách sản phẩm:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + ": " + product.getPrice());
        }

        // Thêm sản phẩm vào giỏ hàng
        Product product1 = products.get(0);
        Product product2 = products.get(1);
        store.addToCart(product1);
        store.addToCart(product2);

        // Tính tổng giá trị của các sản phẩm trong giỏ hàng
        double cartTotalPrice = store.getCartTotalPrice();
        System.out.println("Tổng giá trị của các sản phẩm trong giỏ hàng: " + cartTotalPrice);

        // Xóa sản phẩm khỏi giỏ hàng
        store.removeFromCart(product1);

        // Tính tổng giá trị của các sản phẩm trong giỏ hàng sau khi xóa
        cartTotalPrice = store.getCartTotalPrice();
        System.out.println("Tổng giá trị của các sản phẩm trong giỏ hàng sau khi xóa: " + cartTotalPrice);
    }

}
