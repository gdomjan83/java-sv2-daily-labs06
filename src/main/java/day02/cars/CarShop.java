package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= maxPrice) {
            return carsForSell.add(car);
        }
        return false;
    }

    public int sumCarPrice() {
        int total = 0;

        for (Car actual : carsForSell) {
            total += actual.getPrice();
        }
        return total;
    }

    public int numberOfCarsCheaperThan(int price) {
        int total = 0;

        for (Car actual : carsForSell) {
            if (actual.getPrice() <= price) {
                total++;
            }
        }
        return total;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> result = new ArrayList<>();

        for (Car actual : carsForSell) {
            if (actual.getBrand().equalsIgnoreCase(brand)) {
                result.add(actual);
            }
        }
        return result;
    }
}
