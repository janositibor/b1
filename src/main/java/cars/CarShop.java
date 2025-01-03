package cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarShop {
    private String name;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() > maxPrice) {
            return false;
        }
        carsForSell.add(car);
        return true;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }

    public double sumCarPrice() {
        return carsForSell.stream().collect(Collectors.summingInt(Car::getPrice));
    }

    public int numberOfCarsCheaperThan(int price) {
        return (int) carsForSell.stream().filter(c -> c.getPrice() < price).count();
    }

    public List<Car> carsWithBrand(String brand) {
        return carsForSell.stream().filter(c -> c.getBrand().equals(brand)).toList();
    }
}
