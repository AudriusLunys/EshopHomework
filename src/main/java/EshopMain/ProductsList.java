package EshopMain;

import Warehouse.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsList {
    private final List<Product> products = new ArrayList<Product>();

    public ProductsList() {
        this.initStoreItems();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void initStoreItems() {
        Product tShirt1 = new Product(1, "Blue TShirt", 15, 5.36);
        Product tShirt2 = new Product(2, "Red TShirt", 5, 5.50);
        Product tShirt3 = new Product(3, "Black TShirt", 11, 6.50);
        Product pants1 = new Product(4, "Jeans", 3, 9.99);
        Product pants2 = new Product(5, "Track Pants", 22, 8.30);
        Product pants3 = new Product(6, "Cotton Pants", 6, 15.50);
        Product shoes1 = new Product(7, "Crocks", 15, 3.30);
        Product shoes2 = new Product(8, "Nike kedasai", 33, 20.36);
        Product shoes3 = new Product(9, "Air Jordan's", 12, 55.99);

        products.add(tShirt1);
        products.add(tShirt2);
        products.add(tShirt3);
        products.add(pants1);
        products.add(pants2);
        products.add(pants3);
        products.add(shoes1);
        products.add(shoes2);
        products.add(shoes3);
    }

    public void printStoreItems (){
        for (Product i : products) {
            System.out.println("*********************************");
            System.out.println("ID-> "+ i.getItemID() +" Item-> " +  i.getItemName() +"\n"+
                    " Stock-> " + i.getItemQuantity() +" Price-> "+ i.getItemPrice() );

        }
    }
}

