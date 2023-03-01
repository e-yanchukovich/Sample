package lesson6;

import lesson6.hw1.Computer;
import lesson6.hw1.HDD;
import lesson6.hw1.RAM;

public class Homework1 {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1000.0F, "Acer");
        Computer computer2 = new Computer(1500.0F, "ASUS", new RAM(), new HDD());
        Computer computer3 = new Computer(1500.0F, "ASUS", new RAM("Crucial", 2048), new HDD("WD", 1000, 1));
        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
        System.out.println(computer3.toString());
    }
}
