package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductWithPieceTest {
    ProductWithPiece pwp = new ProductWithPiece(Type.DIARY);

    @Test
    public void testProductWithPeaceInit() {
        assertEquals(Type.DIARY, pwp.getType());
        assertEquals(1, pwp.getCount());
    }

    @Test
    public void testAddCount() {
        pwp.addCount();
        pwp.addCount();
        assertEquals(3, pwp.getCount());
    }
}
