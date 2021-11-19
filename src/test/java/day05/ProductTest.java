package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    Product product = new Product("Carrot", Type.VEGETABLE, 150);

    @Test
    public void testProductCreation() {
        assertEquals("Carrot", product.getName());
        assertEquals(Type.VEGETABLE, product.getType());
        assertEquals(150, product.getPrice());
    }
}
