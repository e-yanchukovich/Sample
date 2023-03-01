package lesson6.hw1;

public class Computer {
    float price;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(float price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(float price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer : " +
                "price = " + price +
                ", model = " + model + ", " +
                (ram == null ? "empty" : this.ram.toString()) + ", " +
                (this.hdd == null ? "empty" : this.hdd.toString()) +
                ")";
    }
}