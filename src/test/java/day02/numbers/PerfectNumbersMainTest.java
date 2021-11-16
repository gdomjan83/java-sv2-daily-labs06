package day02.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfectNumbersMainTest {
    PerfectNumbers numbers = new PerfectNumbers();

    @Test
    public void testPerfectNumber() {
        boolean result = numbers.isPerfectNumber(6);
        assertEquals(true, result);
    }

    @Test
    public void testNonPerfectNumber() {
        boolean result = numbers.isPerfectNumber(9);
        assertEquals(false, result);
    }
}
