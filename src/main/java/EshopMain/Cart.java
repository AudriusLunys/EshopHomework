package EshopMain;

import Warehouse.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> cartItems = new ArrayList<Product>();

    public void addProductToCartByPID(int pid) {
        Product product = getProductByProductID(pid);
        addToCart(product);

    }

    private Product getProductByProductID(int pid) {
        Product product = null;
        List<Product> products = new ProductsList().getProducts();
        for (Product prod: products) {
            if (prod.getItemID() == pid) {
                product = prod;
                break;
            }
        }
        return product;
    }
    private void addToCart(Product product) {
        cartItems.add(product);
    }

    void printCartItems() {
        System.out.println("***** ITEMS IN YOUR CART*****");
        for (Product prod: cartItems) {
            System.out.println(" Item-> "+ prod.getItemName() + " Price-> " + prod.getItemPrice());
        }
    }
}
