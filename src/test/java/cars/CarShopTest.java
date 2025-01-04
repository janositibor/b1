package cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {
    private CarShop carShop;
    @BeforeEach
    void init(){
        carShop = new CarShop("Best Car", 10_000_000);
    }
    @Test
    void part1Test(){
        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);

        assertEquals(true,carShop.addCar(car1));
        assertEquals(1,carShop.getCarsForSell().size());
        assertEquals(false,carShop.addCar(car2));
        assertEquals(1,carShop.getCarsForSell().size());

        car1.decreasePrice(10);
        assertEquals(2070000,carShop.getCarsForSell().get(0).getPrice());
    }
    @Test
    void part2Test(){
        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
        Car car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
        Car car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);

        carShop.addCar(car1);
        carShop.addCar(car2);
        car1.decreasePrice(10);
        carShop.addCar(car3);
        carShop.addCar(car4);

        assertEquals(6270000,carShop.sumCarPrice());
        assertEquals(1,carShop.numberOfCarsCheaperThan(2_000_000));
        assertEquals(0,carShop.numberOfCarsCheaperThan(1_000_000));
        assertEquals(2,carShop.carsWithBrand("Toyota").size());
        assertEquals(0,carShop.carsWithBrand("BMW").size());
    }
}