package lesson9.hw2;

public class Car {

    private String vin;
    private int maxSpeed;
    private int year;

    public Car(String vin, int maxSpeed, int year) {
        this.vin = vin;
        this.maxSpeed = maxSpeed;
        this.year = year;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", year=" + year +
                '}';
    }
}
