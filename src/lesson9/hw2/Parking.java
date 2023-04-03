package lesson9.hw2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Parking {

    private final List<Car> carList;

    public Parking() {
        carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }
    public Car checkCar(String vin) throws NoSuchCarException {

        for (Car car : carList) {
            if (car.getVin().equals(vin)) {
                return car;
            }
        }

        throw new NoSuchCarException(vin);
    }

    public int countByYears(int years) {

        int count = 0;

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);


        for (Car car : carList) {
            if (year - car.getYear() == years) {
                count++;
            }
        }

        return count;
    }
}
