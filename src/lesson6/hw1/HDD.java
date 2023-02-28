package lesson6.hw1;

public class HDD {
    String name;
    int capacity;
    int type;

    public HDD() {
    }

    public HDD(String name, int capacity, int type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD " +
                "(name = " + name +
                ", capacity=" + capacity +
                ", type=" + (type == 0 ? "internal" : " external") +
                ")";
    }
}