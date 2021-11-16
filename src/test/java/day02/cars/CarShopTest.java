package day02.cars;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarShopTest {

    Car car1 = new Car("Hyundai", 1400, Color.RED, 1700000);
    Car car2 = new Car("Daewoo", 1600, Color.GREY, 800000);
    Car car3 = new Car("Trabant", 800, Color.GREY, 500000);
    Car car4 = new Car("Daewoo", 1600, Color.BLUE, 1000000);

    CarShop shop = new CarShop("Totalcar", 1000000);

    @Test
    public void testAddCar() {
        shop.addCar(car1);  //not added to shop since it is too expensive
        shop.addCar(car2);
        assertEquals(1, shop.getCarsForSell().size());
        assertEquals("Daewoo", shop.getCarsForSell().get(0).getBrand());
        shop.addCar(car3);
        assertEquals(2, shop.getCarsForSell().size());
    }

    @Test
    public void testSumPrice() {
        shop.addCar(car1);  //not added to shop since it is too expensive
        shop.addCar(car2);
        shop.addCar(car3);
        assertEquals(1_300_000, shop.sumCarPrice());
    }

    @Test
    public void testNumberOfCarsCheaperThan() {
        shop.addCar(car2);
        shop.addCar(car3);
        assertEquals(1, shop.numberOfCarsCheaperThan(700_000));
        assertEquals(0, shop.numberOfCarsCheaperThan(200_000));
    }

    @Test
    public void testCarsWithBrand() {
        shop.addCar(car2);
        shop.addCar(car3);
        shop.addCar(car4);
        List<Car> result = new ArrayList<>();
        List<Car> empty = new ArrayList<>();
        result.add(car2);
        result.add(car4);

        assertEquals(result, shop.carsWithBrand("Daewoo"));
        assertEquals(result, shop.carsWithBrand("DaeWoO"));
        assertEquals(empty, shop.carsWithBrand("Toyota"));
    }
}
