package cars;

public class Car {
    private String brand;
    private double volume;
    private Color color;
    private int price;

    public Car(String brand, double volume, Color color, int price) {
        this.brand = brand;
        this.volume = volume;
        this.color = color;
        this.price = price;
    }

    public void decreasePrice(int percent) {
        price = price * (100 - percent) / 100;
    }

    public String getBrand() {
        return brand;
    }

    public double getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
