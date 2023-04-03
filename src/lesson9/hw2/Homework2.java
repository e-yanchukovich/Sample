package lesson9.hw2;

public class Homework2 {

    public static void main(String[] args) {

        Parking parking = new Parking();

        parking.addCar(new Car("123", 100, 2000));
        parking.addCar(new Car("234", 100, 2010));
        parking.addCar(new Car("345", 100, 2015));
        parking.addCar(new Car("456", 100, 2015));

        try {
            System.out.println(parking.checkCar("123"));
            System.out.println(parking.checkCar("23"));
        } catch (NoSuchCarException e) {
            System.out.println(e.getMessage());
        }

        System.out.println((parking.countByYears(8)));

    }
}
