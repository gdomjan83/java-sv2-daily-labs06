package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    Car car = new Car("Hyundai", 1400, Color.RED, 1700000);

    @Test
    public void testPriceDecrease() {
        car.decreasePrice(50);
        assertEquals(850000, car.getPrice());
    }
}
