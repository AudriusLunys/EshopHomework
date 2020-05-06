package Warehouse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getItemName() {
        //given
        String name = "Juodi batai";
        int ID = 2;
        int quantity = 15;
        double price=2.55;

        //when
        Product product = new Product(2,"Juodi batai",15,2.55);
        // then
        Assert.assertTrue(product.getItemName().equals(name));
        Assert.assertTrue(product.getItemID() == ID);
        Assert.assertTrue(product.getItemPrice()==price);
        Assert.assertTrue(product.getItemQuantity()==quantity);
    }
}