package day03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GiveForintTest {

    GiveForint obj = new GiveForint();

    @Test
    public void testRounding() {
        assertEquals(20, obj.roundToForint(20));
        assertEquals(100, obj.roundToForint(102));
        assertEquals(305, obj.roundToForint(304));
        assertEquals(205, obj.roundToForint(205));
        assertEquals(1165, obj.roundToForint(1166));
        assertEquals(5700, obj.roundToForint(5699));
    }
}
