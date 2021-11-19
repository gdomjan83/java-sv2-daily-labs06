package day05;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {
    Shop shop = new Shop();

    @BeforeEach
    public void addProduct() {
        shop.addProduct(new Product("Carrot", Type.VEGETABLE, 150));
        shop.addProduct(new Product("Bacon", Type.MEAT, 300));
        shop.addProduct(new Product("Ham", Type.MEAT, 450.5));
    }

    @Test
    public void testAddProduct() {
        assertEquals(3, shop.getProducts().size());
        assertEquals("Bacon", shop.getProducts().get(1).getName());
    }

    @Test
    public void testGetProductNumberByType() {
        List<ProductNumberByType> numPerType = shop.getProductNumberByType();
        for (ProductNumberByType actual : numPerType) {
            if (actual.getType() == Type.VEGETABLE) {
                assertEquals(1, actual.getCount());
            }
            if (actual.getType() == Type.MEAT) {
                assertEquals(2, actual.getCount());
            }
        }
    }
}
