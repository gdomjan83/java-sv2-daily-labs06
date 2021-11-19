package day05;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {
    Shop shop = new Shop();

    @Test
    public void testAddProduct() {
        shop.addProduct(new Product("Carrot", Type.VEGETABLE, 150));
        shop.addProduct(new Product("Bacon", Type.MEAT, 300));

        assertEquals(2, shop.getProducts().size());
        assertEquals("Bacon", shop.getProducts().get(1).getName());
    }

}
